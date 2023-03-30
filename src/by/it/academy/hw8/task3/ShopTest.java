package by.it.academy.hw8.task3;

import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        Clothes clothes = new Clothes("T-shirt", SizeCloth.S, "Green");
        Shoes shoes = new Shoes("Sneakers", SizeShoes.S_35, "Black");
        Clothes clothes1 = new Clothes("Cap", SizeCloth.M, "Yellow");
        Shoes shoes1 = new Shoes("Boots", SizeShoes.S_40, "White");
        Clothes clothes2 = new Clothes("Sweater", SizeCloth.S, "Purple");
        Shoes shoes2 = new Shoes("Moccasins", SizeShoes.S_40, "Black");
        Clothes clothes3 = new Clothes("Romper", SizeCloth.XXL, "Green");
        Shoes shoes3 = new Shoes("Slippers", SizeShoes.S_34, "White");
        Clothes clothes4 = new Clothes("Snowsuit", SizeCloth.XL, "Grey");
        Shoes shoes4 = new Shoes("Clogs", SizeShoes.S_37, "Black");
        Clothes clothes5 = new Clothes("Kimono", SizeCloth.S, "White");
        Shoes shoes5 = new Shoes("Loafers", SizeShoes.S_40, "White");
        Shop shop = new Shop();
        shop.addCloth(clothes);
        shop.addShoes(shoes);
        shop.addCloth(clothes1);
        shop.addShoes(shoes1);
        shop.addCloth(clothes2);
        shop.addShoes(shoes2);
        shop.addCloth(clothes3);
        shop.addShoes(shoes3);
        shop.addCloth(clothes4);
        shop.addShoes(shoes4);
        shop.addCloth(clothes5);
        shop.addShoes(shoes5);
        Shoes findShoesWithColorAndSize = shop.findShoesByColorAndSize("Black", SizeShoes.S_35);
        if (findShoesWithColorAndSize == null) {
            System.out.println("Shoes not found");
        } else {
            System.out.println("Shoes found \n" + findShoesWithColorAndSize);
        }
        Clothes findClothesWithColorAndSize = shop.findClothesByColorAndSize("Green", SizeCloth.S);
        if (findClothesWithColorAndSize == null) {
            System.out.println("Clothes not found");
        } else {
            System.out.println("Clothes found \n" + findClothesWithColorAndSize);
        }
        boolean boughtShoes = shop.buyShoes(shoes);
        if (boughtShoes) {
            System.out.println("Shoes has been bought \n" + shoes);
        } else {
            System.out.println("Shoes not purchased, not available");
        }
        boolean boughtCloth = shop.buyClothes(clothes);
        if (boughtCloth) {
            System.out.println("Clothes has been bought \n" + clothes);
        } else {
            System.out.println("Clothes not purchased, not available");
        }
        Clothes areAvailableCloth = shop.availableClothes("Cap", SizeCloth.M, "Yellow");
        if (areAvailableCloth == null) {
            System.out.println("Clothes not available");
        } else {
            System.out.println("Correct! Selected product: \n" + areAvailableCloth);
        }
        Shoes areAvailableShoes = shop.availableShoes("Boots", SizeShoes.S_40, "White");
        if (areAvailableShoes == null) {
            System.out.println("Shoes not available");
        } else {
            System.out.println("Correct! Selected product: \n" + areAvailableShoes);
        }
        List<Clothes> allClothesWithSizeFind = shop.allClothesWithSize(SizeCloth.M);
        System.out.println("Found clothes in this size \n" + allClothesWithSizeFind);
        List<Shoes> allShoesWithSizeFind = shop.allShoesWithSize(SizeShoes.S_40);
        System.out.println("Found shoes in this size \n" + allShoesWithSizeFind);
    }
}
