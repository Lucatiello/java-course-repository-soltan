package by.it.academy.hw4;

public class Task4 {
    public static void main(String[] args) {
        int[] num = {5,7,2,4,9,6};
        findMinAndMax(num);
    }
    public static void findMinAndMax(int[] num) {
        int max = num[0];
        int min = num[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                indexMax = i;
            } else if (num[i] < min) {
                min = num[i];
                indexMin = i;
            }
        }
        System.out.println("The minimum array element is " + min + " \nMinimal index is " + indexMin);
        System.out.println("The maximum array element is " + max + " \nMax index is " + indexMax);
    }

}
