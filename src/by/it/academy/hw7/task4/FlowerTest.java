package by.it.academy.hw7.task4;

public class FlowerTest {
    public static void main(String[] args) { //task-1
       Flower tulip = new Flower("Tulip", "White", 5, 3);
       Flower rose = new Flower("Rose", "red", 7, 5);
       Flower violet = new Flower("Violet", "violet", 4, 8);
       Bouquet bouquet = new Bouquet();
       bouquet.addFlowersInBouquet(tulip);
       bouquet.addFlowersInBouquet(rose);
       bouquet.addFlowersInBouquet(violet);
        System.out.println("Our bouquet: ");
        bouquet.printNameOfFlowers();
        System.out.println("\nColors in the bouquet: ");
        bouquet.printColorOfFlowers();
        System.out.println("\nPrice of this bouquet");
        bouquet.printPriceOfBouquet();
        System.out.println("\nLifetime of this bouquet");
        bouquet.printBestBeforeDay();




    }
}
