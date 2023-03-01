package by.it.academy.hw8;

public class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public void prepare(Cookable c) {
        c.cook();
    }
}
