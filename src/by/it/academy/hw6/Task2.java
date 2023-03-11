package by.it.academy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "Дан текст, найти 111221 наибольшее2132212 количество12312312312 идущих цифр 55555555555555555 подряд";
        Pattern pattern = Pattern.compile("(.)\\1+");
        Matcher matcher = pattern.matcher(str1);
        String max = null;
        int num = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int numLength = str1.substring(start, end).length();
            System.out.println("Найдено совпадение " + str1.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
            if (numLength > num) {
                num = numLength;
                max = str1.substring(start, end);
            }
        }
        System.out.println("Максимальное значение повторяющихся чисел:" + max);
    }
}

