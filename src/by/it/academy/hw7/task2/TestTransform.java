package by.it.academy.hw7.task2;

public class TestTransform {
    public static void main(String[] args) {
        Kelvin kelvinsTransform = new Kelvin(12);
        System.out.println(kelvinsTransform.celsius + " Celsius to Kelvins: " + kelvinsTransform.degree());
        Fahrenheit fahrenheitsTransform = new Fahrenheit(18);
        System.out.println(fahrenheitsTransform.celsius + " Celsius to Fahrenheits " + fahrenheitsTransform.degree());
    }
}