package by.it.academy;

public class Task4 {
    public static void main(String[] args) {
        byte digitByte = 127;
        short digitShort = 32767;
        int digitInt = 2147483647;
        long digitLong = 922337203;
        float digitFloat = 66.6000006f;
        double digitDouble = 55.78912345678;
        char symChar = 64;
        conversionByte(digitByte, digitShort, digitInt, digitLong, digitFloat, digitDouble, symChar);
        conversionShort(digitShort, digitInt, digitLong, digitFloat, digitDouble, symChar);
        conversionInt(digitInt, digitLong, digitFloat, digitDouble, symChar);
        conversionLong(digitLong, digitDouble, digitFloat);
        conversionFloat(digitFloat, digitDouble);
        conversionDouble(digitInt, digitLong, digitFloat, digitDouble);
        conversionChar(digitByte, digitShort, digitInt, digitLong, digitFloat, digitDouble, symChar);
    }

    public static void conversionByte(byte digitByte, short digitShort, int digitInt, long digitLong, float digitFloat, double digitDouble, char symChar) {
        digitShort = digitByte;
        digitInt = digitByte;
        digitLong = digitByte;
        digitFloat = digitByte;
        digitDouble = digitByte;
        symChar = (char) digitByte;
        System.out.println("The byte conversion has the following meanings: " + "\nbyte: " + digitByte + "\n" + "short: " + digitShort + "\n"
                + "int: " + digitInt + "\n" + "long: " + digitLong + "\n" + "float: " + digitFloat + "\n"
                + "double: " + digitDouble + "\n" + "char: " + symChar + "\n");
    }

    public static void conversionShort(short digitShort, int digitInt, long digitLong, float digitFloat, double digitDouble, char symChar) {
        digitInt = digitShort;
        digitLong = digitShort;
        digitFloat = digitShort;
        digitDouble = digitShort;
        symChar = (char) digitShort;
        System.out.println("The short conversion has the following meanings: " + "\nshort: " + digitShort + "\n"
                + "int: " + digitInt + "\n" + "long: " + digitLong + "\n" + "float: " + digitFloat + "\n"
                + "double: " + digitDouble + "\n" + "char: " + symChar + "\n");
    }

    public static void conversionInt(int digitInt, long digitLong, float digitFloat, double digitDouble, char symChar) {
        digitLong = digitInt;
        digitFloat = (float) digitInt;
        digitDouble = digitInt;
        symChar = (char) digitInt;
        System.out.println("The int conversion has the following meanings: " + "\nint: " + digitInt + "\n" + "long: " + digitLong + "\n" + "float: " + digitFloat + "\n"
                + "double: " + digitDouble + "\n" + "char: " + symChar + "\n");
    }

    public static void conversionLong(long digitLong, double digitDouble, float digitFloat) {
        digitDouble = digitLong;
        digitFloat = (float) digitLong;
        System.out.println("The long conversion has the following meanings: " + "\nlong: " + digitLong + "\n" + "float: " + digitFloat + "\n" + "double: " + digitDouble + "\n");
    }

    public static void conversionFloat(float digitFloat, double digitDouble) {
        digitDouble = digitFloat;
        System.out.println("The float conversion has the following meanings: " + "\nfloat: " + digitFloat + "\n" + "double: " + digitDouble + "\n");
    }

    public static void conversionDouble(int digitInt, long digitLong, float digitFloat, double digitDouble) {
        digitInt = (int) digitDouble;
        digitLong = (long) digitDouble;
        digitFloat = (float) digitDouble;
        System.out.println("The double conversion has the following meanings: " + "\nint: " + digitInt + "\n" + "long: " + digitLong + "\n" + "float: " + digitFloat + "\n"
                + "double: " + digitDouble + "\n");
    }

    public static void conversionChar(byte digitByte, short digitShort, int digitInt, long digitLong, float digitFloat, double digitDouble, char symChar) {
        digitShort = (short) symChar;
        digitInt = symChar;
        digitLong = symChar;
        digitFloat = symChar;
        digitDouble = symChar;
        System.out.println("The char conversion has the following meanings: " + "\nbyte: " + digitByte + "\n" + "short: " + digitShort + "\n"
                + "int: " + digitInt + "\n" + "long: " + digitLong + "\n" + "float: " + digitFloat + "\n"
                + "double: " + digitDouble + "\n" + "char: " + symChar);
    }
}
