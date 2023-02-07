package by.it.academy.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number");
        int secondNum = sc.nextInt();
        System.out.println("Enter third number");
        int thirdNum = sc.nextInt();
        System.out.println("Numbers in variables a, b, c: " + firstNum + " " + secondNum + " " + thirdNum);
        if (secondNum > thirdNum) {
            int x = secondNum;
            secondNum = thirdNum;
            thirdNum = x; // swap (secondNum, thirdNum);
        }
        if (firstNum > thirdNum) {
            int x = firstNum;
            firstNum = thirdNum;
            thirdNum = x; // swap (firstNum, thirdNum);
        }
        if (firstNum > secondNum) {
            int x = firstNum;
            firstNum = secondNum;
            secondNum = x; // swap (firstNum, secondNum)
            System.out.println("Increasing sequence: " + firstNum + " " + secondNum + " " + thirdNum);
        }
    }
}
