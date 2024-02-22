package com.soroko.project.lesson06;

import com.soroko.project.lesson06.Homework.MyPermittedProducts;
import com.soroko.project.lesson06.Homework.Product;

public class Homework07 {
    public static void main(String[] args) {

        String strMilk = "milk";
        double milkProteins = 2.9;
        double milkFats = 2.5;
        double milkCarbs = 4.8;
        int milkCalories = 42;

        Product milk = new Product();
        milk.setProductName(strMilk);
        milk.setProteins(milkProteins);
        milk.setFats(milkFats);
        milk.setCarbohydrates(milkCarbs);
        milk.setCalories(milkCalories);

        String strEgg = "egg";
        Product egg = new Product(strEgg);
        egg.setProductName("bread");

        String strKvass = "kvass";
        double kvassCarbs = 5.2;
        int kvassCalories = 27;
        Product kvass = new Product(strKvass, kvassCarbs, kvassCalories);

        String strBeer = "beer";
        double beerProteins = 0.5;
        double beerFats = 0.1;
        double beerCarbs = 3.5;
        int beerCalories = 43;
        Product beer = new Product(strBeer, beerProteins, beerFats, beerCarbs, beerCalories);

        MyPermittedProducts diet = new MyPermittedProducts();
        boolean checkMilk = diet.checkProduct(milk);
        if (!checkMilk) System.out.println("Wrong product! Keep a diet!");
        else System.out.println("That's good");
        boolean checkKvass = diet.checkProduct(kvass);
        if (!checkKvass) System.out.println("Wrong product! Keep a diet!");
        else System.out.println("That's good");
    }
}
