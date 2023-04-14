package by.it.academy.hw15.task2;

import java.util.Collection;
import java.util.List;


public class Task2Test {
    public static void main(String[] args) {
        Collection<Integer> col = List.of(1, 2, 3, 4, 5, 19);
        int min = col.stream().min(Integer::compareTo).orElse(0);
        int max = col.stream().max(Integer::compareTo).orElse(0);
        double average = col.stream().mapToInt(Integer::intValue).average().orElse(0);
        int product = col.stream().reduce(1, (a, b) -> a * b);
        int sum = col.stream().reduce(0, Integer::sum);
        int digitSum = col.stream()
                .mapToInt(Integer::intValue)
                .map(Task2Test::sumDigits)
                .reduce(0, Integer::sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Sum: " + sum);
        System.out.println("Digit sum: " + digitSum);
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
