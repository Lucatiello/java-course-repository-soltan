package by.it.academy.hw4;



public class Task5 {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 6, 5, 1};
        System.out.println(getMinimalNumber(array));
    }

    public static int getMinimalNumber(int[] array) {

        int minimalNumber = array[0];
        for (int i = 1; i < array.length; i = i + 2)
            if (array[i] < minimalNumber) {
                minimalNumber = array[i];
            }
        return minimalNumber;
    }
}
