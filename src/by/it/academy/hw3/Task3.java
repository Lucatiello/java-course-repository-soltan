package by.it.academy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Day off: Saturday");
                break;
            case 7:
                System.out.println("Day off: Sunday");
                break;
            default:
                System.out.println("ERROR. Specified day does not exist");
        }
    }
}