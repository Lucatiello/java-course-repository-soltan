package by.it.academy.hw7;

public class Apple extends Fruit {

    public Apple(double weightInGram, double priceForGram) {
        super(weightInGram, priceForGram);
    }

    public double computeCost() {
        return getWeight() * getPrice();
    }
}
