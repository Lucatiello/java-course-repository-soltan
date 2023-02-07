package by.it.academy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String firstQuarter = "The number falls into the first quarter";
        String secondQuarter = "The number falls into the second quarter";
        String thirdQuarter = "The number falls into the third quarter";
        String fourthQuarter = "The number falls into the fourth quarter";
        String illegalValue = "Oops, someone entered the wrong value";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 59");
        int minNum = sc.nextInt();
        if (minNum <= 0 || minNum > 59) {
            System.out.println(illegalValue);
        } else if (minNum < 14) {
            System.out.println(firstQuarter);
        } else if (minNum < 29) {
            System.out.println(secondQuarter);
        } else if (minNum < 44) {
            System.out.println(thirdQuarter);
        } else if (minNum < 59) {
            System.out.println(fourthQuarter);
        }
    }
}
