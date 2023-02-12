package by.it.academy.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 2, -10, -20, 15, -6, -7, -8, 22};
        int positive = 0;
        int negative = 0;
        for (int x : array) {
            if (x > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        int[] arrayPositive = new int[positive];
        int[] arrayNegative = new int[negative];
        int countPositive = 0;
        int countNegative = 0;
        for (int x : array) {
            if (x > 0) {
                arrayPositive[countPositive] = x;
                countPositive ++;
            } else {
                arrayNegative[countNegative] = x;
                countNegative++;
            }
        }
        System.out.println("Negative array is " + Arrays.toString(arrayNegative));
        System.out.println("Positive array is " + Arrays.toString(arrayPositive));
    }
}
