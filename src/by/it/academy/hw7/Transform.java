package by.it.academy.hw7;

public class Transform {
    double celsius;

    public Transform(double celsius) {
        this.celsius = celsius;
    }

    double TransformToFahrenheits() {
        return celsius * 1.8 + 32;
    }

    double TransformToKelvins() {
        return celsius + 275.15;
    }

}
