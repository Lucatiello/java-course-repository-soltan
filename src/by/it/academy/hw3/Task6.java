package by.it.academy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle");
        int number1 = sc.nextInt();
        System.out.println("Enter the length of the second side of the triangle");
        int number2 = sc.nextInt();
        System.out.println("Enter the length of the third side of the triangle");
        int number3 = sc.nextInt();
        if ((number1 < number2 + number3) && (number2 < number1 + number3) && (number3 < number1 + number2)) {
            System.out.println("The triangle may exist");
        } else {
            System.out.println("The triangle cannot exist");
        }
    }
}