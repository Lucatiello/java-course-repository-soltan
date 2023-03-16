package by.it.academy.hw7.task3;

public class FruitTest {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple",3000, 0.1);
        System.out.print("Apple ");
        apple.printManufactureInfo();
        Fruit apricot = new Fruit("Apricot",4000, 0.5);
        System.out.print("Apricot ");
        apricot.printManufactureInfo();
        Fruit pear = new Fruit("Pear",2000, 0.3);
        System.out.print("Apricot ");
        apricot.printManufactureInfo();
        Basket basket = new Basket();
        basket.addFruitsInBasket(apple);
        basket.addFruitsInBasket(apricot);
        basket.addFruitsInBasket(pear);
        System.out.println("\nBasket of fruits: ");
        basket.calculatingTheCostOfFruits();
    }
}