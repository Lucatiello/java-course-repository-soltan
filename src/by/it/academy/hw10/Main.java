package by.it.academy.hw10;


import java.util.*;

import static by.it.academy.hw10.Money.max;


public class Main {
    public static void main(String[] args) {
        //task-1
        Set<Integer> iSet1 = new TreeSet<>();
        Collections.addAll(iSet1, 2, 4, 1, 6, 7);
        Collection.printSet("set1", iSet1);
        Set<Integer> iSet2 = new LinkedHashSet<>();
        Collections.addAll(iSet2, 12, 3, 7, 98, 1, 5, 4);
        Collection.printSet("set2", iSet2);
        Set<Integer> iSet3 = Collection.intersect(iSet1, iSet2);
        Collection.printSet("set1 intersect set2", iSet3);
        Collection.printSet("set1 union set2 without intersect", Collection.union(iSet2, iSet1));
        System.out.println("------------------------------");
        //task-2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-ZaА-Я]", "");
            if (word.length() > 0) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("---------------------------");
        //task-3
        Stack<Integer> money = new Stack<>();
        money.push(5);
        money.push(500);
        money.push(200);
        money.push(50);
        money.push(100);
        money.push(10);
        money.push(20);
        System.out.println("What Belarusian banknotes are in the stack: " + money);
        System.out.println("Removing the top bill: " + money.pop());
        System.out.println("Checking the new highest bill: " + money.peek());
        System.out.println("Checking the stack of banknotes again: " + money);
        System.out.println("The nominally largest banknote in the stack: " + max(money));
        System.out.println("---------------------------");
        //task-4
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





