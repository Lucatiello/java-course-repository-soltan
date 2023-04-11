package by.it.academy.hw14.task1;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input time interval: ");
        int seconds = sc.nextInt();
        Time time = new Time(seconds);
        time.run();
    }
}
