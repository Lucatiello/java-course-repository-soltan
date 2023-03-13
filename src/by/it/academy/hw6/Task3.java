package by.it.academy.hw6;


public class Task3 {
    public static void main(String[] args) {
        String text = "Hello my friend how are you?";
        String regex = ("\\s*[\\s+,]\\s*");
        String[] strings = text.split(regex);
        int lengthMax = 0;
        int lengthMin = strings[0].length();
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < strings.length; i++) {
            if (lengthMax < strings[i].length()) {
                lengthMax = strings[i].length();
                indexMax = i;
            }
            if (lengthMin >= strings[i].length()) {
                lengthMin = strings[i].length();
                indexMin = i;
            }
        }
        wordSubstitution(text, indexMax, indexMin);
    }

    static void wordSubstitution(String text, int indexMax, int indexMin) {
        String[] strings = text.split("\\W");
        StringBuilder textMod = new StringBuilder();
        String string = strings[indexMax];
        strings[indexMax] = strings[indexMin];
        strings[indexMin] = string;
        for (String word : strings) {
            textMod.append(word).append(" ");
        }
        System.out.println(textMod);
    }
}

