package by.it.academy.hw12.task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2Test {
    public static void main(String[] args) {
        int word = 0;
        int punctuationMarks = 0;
        Matcher m;
        String text = "Hello world, my friend..";
        Pattern punctuation = Pattern.compile("\\p{Punct}");
        String[] arrayText = text.split("\\s");
        for (String s : arrayText) {
            int count = 0;
            m = punctuation.matcher(s);
            while (m.find()) {
                ++count;
            }
            punctuationMarks += count;
            if (count != s.length()) {
                ++word;
            }
        }
        System.out.println("Number of words: " + word);
        System.out.println("Number of punctuation marks: " + punctuationMarks);
        try (FileOutputStream fileOutputStream = new FileOutputStream("D:/java course/git-java-course/src/by/it/academy/hw12/task2/text.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}