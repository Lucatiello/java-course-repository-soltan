package by.it.academy.hw8.task3;

public class Shoes {
    String name;
    SizeShoes size;
    String color;

    public Shoes(String name, SizeShoes size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name : " + name + "\nsize : " + size + "\ncolor : " + color;
    }
}
