package by.it.academy.hw8;

public class Hoodie extends ClothesAndShoes {
    public Hoodie(String color, String size) {
        super(color, size);
    }

    public void SizeCheck() {
        if (getSize().equals(Size.XL.toString())) {
            System.out.println("Hoodie size XL is in stock");
        } else if (getSize().equals(Size.XXL.toString())) {
            System.out.println("Hoodie size XXL is in stock");
        } else if (getSize().equals(Size.L.toString())) {
            System.out.println("Hoodie size L is in stock");
        } else {
            System.out.println("This hoodie size is not available. Available:: XXL, XL, L");
        }
    }

    public void ColorCheck() {
        if (getColor().equals(Color.GREEN.toString())) {
            System.out.println("Green color hoodie is in stock");
        } else if (getColor().equals(Color.VIOLET.toString())) {
            System.out.println("Violet color hoodie is in stock");
        } else if (getColor().equals(Color.RED.toString())) {
            System.out.println("Red color hoodie is in stock");
        } else if (getColor().equals(Color.BLUE.toString())) {
            System.out.println("Blue color hoodie is in stock");
        } else if (getColor().equals(Color.BLACK.toString())) {
            System.out.println("Black color hoodie is in stock");
        } else if (getColor().equals(Color.WHITE.toString())) {
            System.out.println("White color hoodie is in stock");
        } else {
            System.out.println("This hoodie color is not available. Available: Green, Violet, Red, Blue, Black, White");
        }
    }
}
