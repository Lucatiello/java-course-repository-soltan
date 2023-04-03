package by.it.academy.hw7.task2;

public class Kelvin extends Celsius implements Transformation {

    public Kelvin(double celsius) {
        super(celsius);
    }

    @Override
    public double degree() {
        return celsius + 275.15;
    }
}
