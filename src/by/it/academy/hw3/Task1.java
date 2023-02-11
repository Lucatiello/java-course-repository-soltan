package by.it.academy.hw3;

public class Task1 {
    public static void main(String[] args) {
    int intNumber = 65;
    Integer integerNumber = new Integer(25);
    intNumber = integerNumber; // Auto unpacking
    integerNumber = intNumber * 15; // Auto packing
        System.out.println("Result of auto unpacking = " + intNumber);
        System.out.println("Result of auto packing = " + integerNumber);
    }
}
