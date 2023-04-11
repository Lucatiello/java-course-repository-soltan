package by.it.academy.hw9.task2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        System.out.println("Calling the first value " + pair.getFirst());
        System.out.println("Calling the second value " + pair.getSecond());
        pair.setFirst(3);
        System.out.println("Change the first value " + pair.getFirst());
        pair.setSecond(10);
        System.out.println("Change the second value " + pair.getSecond());
        Pair<Integer, Integer> pair1 = pair.swap();
        System.out.println("Swap: " + pair1.getFirst() + " " + pair1.getSecond());
    }
}
