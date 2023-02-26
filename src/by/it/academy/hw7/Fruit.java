package by.it.academy.hw7;

public abstract class Fruit {
    private final double weightInGram;
    private final double priceForGram;

    public Fruit(double weightInGram, double priceForGram) {
        this.weightInGram = weightInGram;
        this.priceForGram = priceForGram;
    }

    public void printManufactureInfo() {
        System.out.println("Made in Belarus");
    }

    public double getWeight() {
        return weightInGram;
    }

    public double getPrice() {
        return priceForGram;
    }
}

