package by.it.academy.hw6;

public class Task4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSomeString();
        System.out.println(stringBuilder);
        changeStringBuilder(stringBuilder);
    }

    private static StringBuilder createSomeString() {
        StringBuilder result = new StringBuilder();
        result.append(3).append(" + ").append(56).append(" = ").append(3 + 56).append("\n")
                .append(3).append(" - ").append(56).append(" = ").append(3 - 56).append("\n")
                .append(3).append(" * ").append(56).append(" = ").append(3 * 56).append("\n");
        return result;
    }

    static void changeStringBuilder(StringBuilder stringBuilder) {
        int index;
        while ((index = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(index);
            stringBuilder.insert(index, "равно");
        }
        System.out.println(stringBuilder);
    }
}
