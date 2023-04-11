package by.it.academy.hw12.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1Test {
    private static final List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        createFileWithNumbers("D:/java course/git-java-course/src/by/it/academy/hw12/task1/in1.txt");
        createFileWithNumbers("D:/java course/git-java-course/src/by/it/academy/hw12/task1/in2.txt");

        read("D:/java course/git-java-course/src/by/it/academy/hw12/task1/in1.txt");
        read("D:/java course/git-java-course/src/by/it/academy/hw12/task1/in2.txt");

        Collections.sort(numbers);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:/java course/git-java-course/src/by/it/academy/hw12/task1/out.txt"))) {
            for (Integer integer : numbers) {
                writer.write(integer + "\n");
                System.out.println(integer);
            }
        }
    }

    private static void read(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                numbers.add(Integer.parseInt(reader.readLine()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void createFileWithNumbers(String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                writer.write(random.nextInt(1, 100000) + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

