package by.it.academy.hw8.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Clothes> clothes;
    List<Shoes> shoes;

    public Shop() {
        clothes = new ArrayList<>();
        shoes = new ArrayList<>();
    }

    public void addCloth(Clothes cloth) {
        clothes.add(cloth);
    }

    public void addShoes(Shoes shoes) {
        this.shoes.add(shoes);
    }

    public Clothes findClothesByColorAndSize(String color, SizeCloth size) {
        for (Clothes cloth : clothes) {
            if (cloth.color.equalsIgnoreCase(color)
                    && cloth.size.equals(size)) {
                return cloth;
            }
        }
        return null;
    }

    public Shoes findShoesByColorAndSize(String color, SizeShoes size) {
        for (Shoes shoe : shoes) {
            if (shoe.color.equalsIgnoreCase(color)
                    && shoe.size.equals(size)) {
                return shoe;
            }
        }
        return null;
    }

    public boolean buyClothes(Clothes cloth) {
        return clothes.remove(cloth);
    }

    public boolean buyShoes(Shoes shoes) {
        return this.shoes.remove(shoes);
    }

    public Clothes availableClothes(String name, SizeCloth size, String color) {
        for (Clothes cloth : clothes) {
            if (cloth.name.equalsIgnoreCase(name) &&
                    cloth.size.equals(size) && cloth.color.equals(color)) {
                return cloth;
            }
        }
        return null;
    }

    public Shoes availableShoes(String name, SizeShoes size, String color) {
        for (Shoes shoe : shoes) {
            if (shoe.name.equalsIgnoreCase(name)
                    && shoe.size.equals(size)
                    && shoe.color.equals(color)) {
                return shoe;
            }
        }
        return null;
    }

    public List<Clothes> allClothesWithSize(SizeCloth size) {
        List<Clothes> allClothes = new ArrayList<>();
        for (Clothes cloth : clothes) {
            if (cloth.size.equals(size)) {
                allClothes.add(cloth);
            }
        }
        return allClothes;
    }

    public List<Shoes> allShoesWithSize(SizeShoes size) {
        List<Shoes> allShoes = new ArrayList<>();
        for (Shoes shoe : shoes) {
            if (shoe.size.equals(size)) {
                allShoes.add(shoe);
            }
        }
        return allShoes;
    }
}
