package by.it.academy.hw6;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = ("""
                Object-oriented programming is a programming language
                Object-oriented programming blabla. Object-oriented programming bla.
                Object-oriented programming is a programming language
                Object-oriented programming blabla. Object-oriented programming bla.""");
        System.out.println(resultTwoString(text));
    }

    static String resultTwoString(String text) {
        Pattern p = Pattern.compile("Object-oriented programming");
        String[] arrayString = text.split("Object-oriented programming");
        for (int i = 1; i < arrayString.length; i++) {
            arrayString[i] = "Object-oriented programming" + arrayString[i];
        }
        for (int i = 1; i < arrayString.length; i++) {
            if (i % 2 == 0) {
                arrayString[i] = arrayString[i].replaceAll(p.pattern(), "OOP");
            }
        }
        StringBuilder textBuilder = new StringBuilder();
        for (String string : arrayString) {
            textBuilder.append(string);
        }
        return textBuilder.toString();
    }
}
