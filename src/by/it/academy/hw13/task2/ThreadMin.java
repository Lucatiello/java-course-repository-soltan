package by.it.academy.hw13.task2;

public class ThreadMin extends Thread {
    private int minimum;
    private final int[] array;

    public ThreadMin(int[] array) {
        this.array = array;
    }

    public void run() {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        minimum = min;
    }

    public int getMin() {
        return minimum;
    }
}
