package by.it.academy.hw7;

public class Apricot extends Fruit {
    public Apricot(double weightInGram, double priceForGram) {
        super(weightInGram, priceForGram);
    }

    public double computeCost() {
        return getWeight() * getPrice();
    }
}
