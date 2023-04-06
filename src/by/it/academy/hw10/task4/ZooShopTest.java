package by.it.academy.hw10.task4;

public class ZooShopTest {
    public static void main(String[] args) {
        ZooShop store = new ZooShop();
        Pets cat1 = new Pets("Chip", "British fold", 150);
        Pets cat2 = new Pets("Casper", "Maine Coon", 480);
        Pets dog1 = new Pets("Cooper", "German shepherd", 220);
        Pets dog2 = new Pets("Tucker", "English bulldog", 500);
        Pets parrot1 = new Pets("Ketty", "Cockatoo", 300);
        Pets parrot2 = new Pets("Paulie", "Ara", 400);
        store.addPet(cat1);
        store.addPet(cat2);
        store.addPet(dog1);
        store.addPet(dog2);
        store.addPet(parrot1);
        store.addPet(parrot2);
        System.out.println("Store before sorting");
        for (Pets pet : store.getPets()) {
            System.out.println(pet);
        }
        store.sortByName();
        System.out.println("Store after sorting by name");
        for (Pets pet : store.getPets()) {
            System.out.println(pet);
        }
        store.sortByPrice();
        System.out.println("Store after sorting by price");
        for (Pets pet : store.getPets()) {
            System.out.println(pet);
        }
        System.out.println("Store by price range 400-500");
        for (Pets pet : store.sortByPriceRange(400, 500)) {
            System.out.println(pet);
        }
        Pets boughtPet = store.buyPet("Paulie");
        if (boughtPet != null) {
            System.out.println("You buy pet " + boughtPet.name);
            System.out.println("Store after the purchase");
            for (Pets pet : store.getPets()) {
                System.out.println(pet);
            }
        } else {
            System.out.println("Couldn't find a pet with that name");
        }
    }
}





