package by.it.academy.hw8.task3;

public class Clothes {
    String name;
    String color;
    SizeCloth size;

    public Clothes(String name, SizeCloth size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name : " + name + "\nsize : " + size + "\ncolor : " + color;
    }
}


