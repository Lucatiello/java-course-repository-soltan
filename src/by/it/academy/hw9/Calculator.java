package by.it.academy.hw9;

public class Calculator {
    static int a;
    static int b;

    public Calculator(int a, int b) {
        Calculator.a = a;
        Calculator.b = b;
    }

    public static <T extends Number, V extends Number> int sum(T a, V b) {
        return a.intValue() + b.intValue();
    }

    public static <T extends Number, V extends Number> int multiply(T a, V b) {
        return a.intValue() * b.intValue();
    }

    public static <T extends Number, V extends Number> int subtraction(T a, V b) {
        return a.intValue() - b.intValue();
    }

    public static <T extends Number, V extends Number> int divide(T a, V b) {
        return a.intValue() / b.intValue();
    }
}

