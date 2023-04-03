package by.it.academy.hw7.task3;

public class Fruit implements Printable {
    private final String name;
    private final double weightInGram;
    private final double priceForGram;

    public Fruit(String name, double weightInGram, double priceForGram) {
        this.name = name;
        this.weightInGram = weightInGram;
        this.priceForGram = priceForGram;
    }

    public void printManufactureInfo() {
        System.out.println("Made in Belarus");
    }

    public double getCost() {
        return weightInGram * priceForGram;
    }

    public String getNameOfFruit() {
        return name;
    }
}

