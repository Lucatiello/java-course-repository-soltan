package by.it.academy.hw4;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please, enter any number");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println("Sum of digits is: " + sumDigits(digit) + "\nThe sum of the multiplication is:" + multiplicationDigits(digit));
    }
    public static int sumDigits(int digit) {
        int sum = 0;
        while (digit != 0) {
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }
    public static int multiplicationDigits (int digit) {
        int multiplication = 1;
        while (digit != 0) {
            multiplication *= digit % 10;
            digit /= 10;
        }
        return multiplication;
    }
}