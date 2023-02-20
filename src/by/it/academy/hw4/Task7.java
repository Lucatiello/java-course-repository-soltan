package by.it.academy.hw4;

public class Task7 {
    public static void main(String[] args) {
        int number = 6;
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int)(Math.random()*10+1);
            System.out.println(" " + array[i]);
        }
        for (int i = 0; i < number/2; i++) {
            int j = array[i];
            array[i] = array[number-1-i];
            array[number-1-i]=j;
        }
        System.out.println("\n ");
        System.out.println("Inverted array ");
        for (int i = 0; i < number; i++) {
            System.out.println(" " + array[i]);
        }
    }
}
