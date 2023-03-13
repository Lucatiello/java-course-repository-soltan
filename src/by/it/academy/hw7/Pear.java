package by.it.academy.hw7;

public class Pear extends Fruit {
    public Pear(double weightInGram, double priceForGram) {
        super(weightInGram, priceForGram);
    }

    public double computeCost() {
        return getWeight() * getPrice();
    }
}
