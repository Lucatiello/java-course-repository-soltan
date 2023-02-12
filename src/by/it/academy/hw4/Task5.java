package by.it.academy.hw4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 6, 5, 8};
        Arrays.sort(array);
        for (int x : array) {
            if (x % 2 != 0 ) {
                System.out.println("Minimal odd index = " + x);
                break;
            }
        }
    }
}
