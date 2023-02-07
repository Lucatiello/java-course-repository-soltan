package by.it.academy.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even \n0");
        } else {
            System.out.println("Odd\n" + a % 2);
        }
    }
}
