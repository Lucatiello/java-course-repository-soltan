package by.it.academy.hw10;

public class Pets {
    String name;
    String breed;
    double price;

    public Pets(String name, String breed, double price) {
        this.name = name;
        this.breed = breed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + name + '\'' +
                ", type='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}
