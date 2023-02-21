package by.it.academy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String email = "thebestmailintheworld@gmail.com";
        if (emailValidator(email)) {
            System.out.println("The email address " + email + " is valid");
        } else {
            System.out.println("The email address " + email + " is invalid");
        }
    }

    public static boolean emailValidator(String email) {
        Pattern pattern = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*\\.\\w{2,4}");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}





