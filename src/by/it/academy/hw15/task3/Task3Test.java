package by.it.academy.hw15.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Test {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<String> result = myList.stream()
                .filter(s -> !s.contains("3"))
                .sorted(Comparator.comparing((String s) ->
                        s.substring(1)).thenComparing(s -> s.substring(0, 1)).reversed())
                .skip(1)
                .limit(myList.size() - 2)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println("Number of remaining elements: " + result.size());
    }
}
