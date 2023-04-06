package by.it.academy.hw10.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ZooShop {
    List<Pets> pets;

    public ZooShop() {
        pets = new ArrayList<>();
    }

    public void addPet(Pets pet) {
        pets.add(pet);
    }

    public void sortByName() {
        pets.sort(Comparator.comparing(Pets::getName));
    }

    public void sortByPrice() {
        pets.sort(Comparator.comparingDouble(Pets::getPrice));
    }

    public ArrayList<Pets> sortByPriceRange(double minPrice, double maxPrice) {
        ArrayList<Pets> sortPets = new ArrayList<>();
        for (Pets pet : pets) {
            if (pet.getPrice() >= minPrice && pet.getPrice() <= maxPrice) {
                sortPets.add(pet);
            }
        }
        return sortPets;
    }

    public Pets buyPet(String name) {
        for (Pets pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                pets.remove(pet);
                return pet;
            }
        }
        return null;
    }

    public List<Pets> getPets() {
        return pets;
    }
}





