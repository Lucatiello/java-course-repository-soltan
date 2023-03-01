package by.it.academy.hw8;

public abstract class ClothesAndShoes {

    private final String color;
    private final String size;

    public ClothesAndShoes(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}

