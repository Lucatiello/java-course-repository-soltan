package by.it.academy.hw13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[5];
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = sc.nextInt();
        }
        ThreadMax threadMax = new ThreadMax(arrayNum);
        ThreadMin threadMin = new ThreadMin(arrayNum);
        threadMax.start();
        threadMin.start();
        try {
            threadMax.join();
            threadMin.join();
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
        System.out.println("Max: " + threadMax.getMax());
        System.out.println("Min: " + threadMin.getMin());
    }
}
