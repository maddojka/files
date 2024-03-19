package com.soroko.project.Homework15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.soroko.project.Homework15.FruitToStorageInfo.FruitType.*;

public class Main {
    public static void main(String[] args) {
        // Creating storage for fruits
        FruitStorage fruitsStorage = new FruitStorage(30);
        System.out.println("Самая низкая цена среди яблок " + fruitsStorage.getMinPriceByType(APPLE));
        // Creating some data
        FruitToStorageInfo russianApples = new FruitToStorageInfo(APPLE, 10.0, 31);
        FruitToStorageInfo anotherApples = new FruitToStorageInfo(null, 13.0, 8);
        FruitToStorageInfo redApples = new FruitToStorageInfo(APPLE, 10.0, 7);
        FruitToStorageInfo greenApples = new FruitToStorageInfo(APPLE, 8.0, 5);
        FruitToStorageInfo goldenApples = new FruitToStorageInfo(APPLE, 8.0, 5);
        FruitToStorageInfo orangeAppricotes = new FruitToStorageInfo(APRICOT, 5.0, 5);
        FruitToStorageInfo yellowAppricotes = new FruitToStorageInfo(APRICOT, 12.0, 3);
        FruitToStorageInfo greenPears = new FruitToStorageInfo(PEAR, 3.0, 3);
        FruitToStorageInfo yellowBananas = new FruitToStorageInfo(BANANA, 2.0, 1);
        FruitToStorageInfo greenBananas = new FruitToStorageInfo(BANANA, 2.0, 1);
        // adding fruits
        System.out.println(fruitsStorage.addToStorage(russianApples));
        System.out.println(fruitsStorage.addToStorage(anotherApples));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(redApples));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(goldenApples));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(greenApples));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(orangeAppricotes));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(yellowAppricotes));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(greenPears));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(yellowBananas));
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.addToStorage(greenBananas));

        // checking added fruits
        for (FruitToStorageInfo i : fruitsStorage.getFruits()) {
            System.out.println(i);
        }
        // checking getNumberOfEmptySlots method
        System.out.println("Количество мест в хранилище: " + fruitsStorage.getNumberOfEmptySlots());
        System.out.println(fruitsStorage.getNumberOfFruitsByType(null));
        System.out.println("Количество яблок: " + fruitsStorage.getNumberOfFruitsByType(APPLE));
        System.out.println("Количество абрикосов: " + fruitsStorage.getNumberOfFruitsByType(APRICOT));
        System.out.println("Количество груш: " + fruitsStorage.getNumberOfFruitsByType(PEAR));
        System.out.println("Количество бананов: " + fruitsStorage.getNumberOfFruitsByType(BANANA));
        // checking increasePrice method
        fruitsStorage.increasePrice(20);
        for (FruitToStorageInfo i : fruitsStorage.getFruits()) {
            System.out.println(i);
        }
        // checking getMinPriceByType method
        System.out.println("Самая низкая цена среди яблок " + fruitsStorage.getMinPriceByType(APPLE));
        System.out.println("Самая низкая цена среди абрикосов " + fruitsStorage.getMinPriceByType(APRICOT));
        System.out.println("Самая низкая цена среди груш " + fruitsStorage.getMinPriceByType(PEAR));
        System.out.println("Самая низкая цена среди бананов " + fruitsStorage.getMinPriceByType(BANANA));
        // checking list getFruitsByTypeAndPrice method
        List<FruitToStorageInfo> list = fruitsStorage.getFruitsByTypeAndPrice(APPLE, 10);
        for (FruitToStorageInfo fruitToStorageInfo : list) {
            System.out.println("Яблоки не больше 10: " + fruitToStorageInfo);
        }
        // Count comparator
        System.out.println("Сортировка по количеству (по убыванию)");
        List<FruitToStorageInfo> countComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> countComparator = new CountComparator();
        countComparatorList = fruitsStorage.sortFruits(countComparator);
        for (FruitToStorageInfo fruitToStorageInfo : countComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Type comparator
        System.out.println("Сортировка по типу");
        List<FruitToStorageInfo> typeComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> typeComparator = new TypeComparator();
        typeComparatorList = fruitsStorage.sortFruits(typeComparator);
        for (FruitToStorageInfo fruitToStorageInfo : typeComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Price comparator
        System.out.println("Сортировка по цене (по возрастанию)");
        List<FruitToStorageInfo> priceComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> priceComparator = new PriceComparator();
        priceComparatorList = fruitsStorage.sortFruits(priceComparator);
        for (FruitToStorageInfo fruitToStorageInfo : priceComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Count and price comparator separated classes
        System.out.println("Сортировка по количеству (по возрастанию) и цене (убыванию)");
        List<FruitToStorageInfo> countAndPriceComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> priceReversedComparator = new PriceComparator().reversed();
        Comparator<FruitToStorageInfo> countAndPriceComparator =
                new CountComparator().reversed().thenComparing(priceReversedComparator);
        countAndPriceComparatorList = fruitsStorage.sortFruits(countAndPriceComparator);
        for (FruitToStorageInfo fruitToStorageInfo : countAndPriceComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Count and price comparator - common class
        System.out.println("Сортировка по количеству (по возрастанию) и цене (убыванию)  - один класс");
        List<FruitToStorageInfo> countAndPriceComparatorList2 = new ArrayList<>();
        Comparator<FruitToStorageInfo> countAndPriceComparator2 = new CountAndPriceComparator();
        countAndPriceComparatorList2 = fruitsStorage.sortFruits(countAndPriceComparator2);
        for (FruitToStorageInfo fruitToStorageInfo : countAndPriceComparatorList2) {
            System.out.println(fruitToStorageInfo);
        }
    }
}
