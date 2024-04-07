package com.soroko.project.Homework23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple redApple = new Apple(1, "красный", 20);
        Apple greenApple = new Apple(2, "зеленый", 15);
        Apple yellowApple = new Apple(3, "желтый", 30);
        AppleStorage appleStorage = new AppleStorage("test.txt");
        AppleFileStorage appleFileStorage = new AppleFileStorage("test.txt");
        try {
            appleFileStorage.add(redApple);
            appleFileStorage.add(greenApple);
            appleFileStorage.add(yellowApple);
            appleFileStorage.remove(greenApple);
            apples = appleStorage.getAll();
            System.out.println(apples);
            appleStorage.add(redApple);
            appleStorage.add(greenApple);
            appleStorage.add(yellowApple);
            appleStorage.getById(1L);
            System.out.println(apples);
            appleStorage.remove(redApple);
            appleFileStorage.getAll();
            System.out.println(appleFileStorage.getById(1L));
            appleFileStorage.remove(yellowApple);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(apples);
    }
}
