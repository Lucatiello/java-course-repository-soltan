package by.it.academy.hw8;

public class Sneakers extends ClothesAndShoes {
    public Sneakers(String color, String size) {
        super(color, size);
    }

    public void SizeCheck() {
        if (getSize().equals(Size.SMALL.toString())) {
            System.out.println("Sneakers size Small is in stock");
        } else if (getSize().equals(Size.MEDIUM.toString())) {
            System.out.println("Sneakers size Medium is in stock");
        } else if (getSize().equals(Size.LARGE.toString())) {
            System.out.println("Sneakers size Large is in stock");
        } else {
            System.out.println("This sneakers size is not available. Available:: Small, Medium, Large");
        }
    }

    public void ColorCheck() {
        if (getColor().equals(Color.GREEN.toString())) {
            System.out.println("Green color sneakers is in stock");
        } else if (getColor().equals(Color.VIOLET.toString())) {
            System.out.println("Violet color sneakers is in stock");
        } else if (getColor().equals(Color.RED.toString())) {
            System.out.println("Red color sneakers is in stock");
        } else if (getColor().equals(Color.BLUE.toString())) {
            System.out.println("Blue color sneakers is in stock");
        } else if (getColor().equals(Color.BLACK.toString())) {
            System.out.println("Black color sneakers is in stock");
        } else if (getColor().equals(Color.WHITE.toString())) {
            System.out.println("White color sneakers is in stock");
        } else {
            System.out.println("This sneakers color is not available. Available: Green, Violet, Red, Blue, Black, White");
        }
    }
}

