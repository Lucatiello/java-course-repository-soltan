package by.it.academy.hw6;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "    Hi,    my    name    is   Artyom   ";
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.trim();
        System.out.println(str1);
    }
}
