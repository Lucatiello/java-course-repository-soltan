package by.it.academy.hw15.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Task1Test {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("test login", "longest string ever", "short", "word", "another word");
        boolean containsLogin = col.stream().anyMatch(str -> str.contains("login"));
        System.out.println("Contains login: " + containsLogin);
        String longestString = col.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println("Longest string: " + longestString);
        String shortestString = col.stream().min(Comparator.comparing(String::length)).orElse(null);
        System.out.println("Shortest string: " + shortestString);
        List<String> wordString = col.stream().filter(str -> str.matches("\\b\\w+\\b")).collect(Collectors.toList());
        System.out.println("Words strings: " + wordString);
        List<String> words = col.stream().flatMap(str -> Arrays.stream(str.split("\\s+")))
                .map(str -> str.replaceAll("\\W", "")).distinct().collect(Collectors.toList());
        System.out.println("Words: " + words);
    }
}
