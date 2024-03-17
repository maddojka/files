package com.soroko.project.Homework15;

import java.util.ArrayList;
import java.util.List;

import static com.soroko.project.Homework15.FruitToStorageInfo.FruitType.*;

public class Main {
    public static void main(String[] args) {
        // Creating storage for fruits
        FruitStorage fruitStorage = new FruitStorage(30);
        System.out.println("Самая низкая цена среди яблок " + fruitStorage.getMinPriceByType(APPLE));
        // Creating some data
        FruitToStorageInfo russianApples = new FruitToStorageInfo(APPLE, 10.0, 31);
        FruitToStorageInfo anotherApples = new FruitToStorageInfo(null, 13.0, 8);
        FruitToStorageInfo redApples = new FruitToStorageInfo(APPLE, 10.0, 7);
        FruitToStorageInfo greenApples = new FruitToStorageInfo(APPLE, 8.0, 5);
        FruitToStorageInfo goldenApples = new FruitToStorageInfo(APPLE, 8.0, 5);
        FruitToStorageInfo orangeAppricotes = new FruitToStorageInfo(APRICOT, 5.0, 5);
        FruitToStorageInfo yellowAppricotes = new FruitToStorageInfo(APRICOT, 12.0, 4);
        FruitToStorageInfo greenPears = new FruitToStorageInfo(PEAR, 3.0, 3);
        FruitToStorageInfo yellowBananas = new FruitToStorageInfo(BANANA, 2.0, 1);
        FruitToStorageInfo greenBananas = new FruitToStorageInfo(BANANA, 2.0, 1);
        // adding fruits
        System.out.println(fruitStorage.addToStorage(russianApples));
        System.out.println(fruitStorage.addToStorage(anotherApples));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(redApples));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(greenApples));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(goldenApples));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(orangeAppricotes));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(yellowAppricotes));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(greenPears));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(yellowBananas));
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.addToStorage(greenBananas));

        // checking added fruits
        for (FruitToStorageInfo i : fruitStorage.getFruits()) {
            System.out.println(i);
        }
        // checking getNumberOfEmptySlots method
        System.out.println("Количество мест в хранилище: " + fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.getNumberOfFruitsByType(null));
        System.out.println("Количество яблок: " + fruitStorage.getNumberOfFruitsByType(APPLE));
        System.out.println("Количество абрикосов: " + fruitStorage.getNumberOfFruitsByType(APRICOT));
        System.out.println("Количество груш: " + fruitStorage.getNumberOfFruitsByType(PEAR));
        System.out.println("Количество бананов: " + fruitStorage.getNumberOfFruitsByType(BANANA));
        // checking increasePrice method
        fruitStorage.increasePrice(20);
        for (FruitToStorageInfo i : fruitStorage.getFruits()) {
            System.out.println(i);
        }
        // checking getMinPriceByType method
        System.out.println("Самая низкая цена среди яблок " + fruitStorage.getMinPriceByType(APPLE));
        System.out.println("Самая низкая цена среди абрикосов " + fruitStorage.getMinPriceByType(APRICOT));
        System.out.println("Самая низкая цена среди груш " + fruitStorage.getMinPriceByType(PEAR));
        System.out.println("Самая низкая цена среди бананов " + fruitStorage.getMinPriceByType(BANANA));
        // checking list getFruitsByTypeAndPrice method
        List<FruitToStorageInfo> list = fruitStorage.getFruitsByTypeAndPrice(APPLE, 10);
        for (FruitToStorageInfo fruitToStorageInfo : list) {
            System.out.println("Яблоки не больше 10: " + fruitToStorageInfo);
        }
    }
}
