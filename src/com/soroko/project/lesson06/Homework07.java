package com.soroko.project.lesson06;

import com.soroko.project.lesson06.Homework.Task1.Climber;
import com.soroko.project.lesson06.Homework.Task1.Group;
import com.soroko.project.lesson06.Homework.Task1.Mountain;
import com.soroko.project.lesson06.Homework.Task2.MyPermittedProducts;
import com.soroko.project.lesson06.Homework.Task2.Product;

public class Homework07 {

    public static void main(String[] args) {
        //Task 01
        // Milk data
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
        // Egg data
        String strEgg = "egg";
        Product egg = new Product(strEgg);
        egg.setProductName("bread");
        // Kvass data
        String strKvass = "kvass";
        double kvassCarbs = 5.2;
        int kvassCalories = 27;
        Product kvass = new Product(strKvass, kvassCarbs, kvassCalories);
        // Beer data
        String strBeer = "beer";
        double beerProteins = 0.5;
        double beerFats = 0.1;
        double beerCarbs = 3.5;
        int beerCalories = 43;
        Product beer = new Product(strBeer, beerProteins, beerFats, beerCarbs, beerCalories);
        // Checking if product is valid and print max setpoints
        MyPermittedProducts diet = new MyPermittedProducts();
        boolean checkMilk = diet.checkProduct(milk);
        System.out.println("A diet has the following parameters:");
        System.out.println("Max value of proteins " + diet.getMAX_PROTEINS());
        System.out.println("Max value of fats " + diet.getMAX_FATS());
        System.out.println("Max value of carbs " + diet.getMAX_CARBS());
        System.out.println("Max value of calories " + diet.getMAX_CALORIES());
        if (!checkMilk) System.out.println("Wrong product! Keep a diet!");
        else System.out.println("That's good");
        boolean checkKvass = diet.checkProduct(kvass);
        if (!checkKvass) System.out.println("Wrong product! Keep a diet!");
        else System.out.println("That's good");
        // Task 02
        // Create climbers and their groups
        // First group
        Climber[] climbersFirstGroup = new Climber[3];
        Climber Alexander = new Climber("Alexander", "Saint Petersburg");
        Climber Ivan = new Climber("Ivan", "Moscow");
        Climber Natalya = new Climber("Natalya", "Minsk");
        climbersFirstGroup[0] = Alexander;
        climbersFirstGroup[1] = Ivan;
        climbersFirstGroup[2] = Natalya;
        // Second group
        Climber[] climbersSecondGroup = new Climber[3];
        Climber Michael = new Climber("Michael", "London");
        Climber Olga = new Climber("Olga", "Moscow");
        climbersSecondGroup[0] = Michael;
        climbersSecondGroup[1] = Olga;
        // Third group
        Climber[] climbersThirdGroup = new Climber[3];
        Climber John = new Climber("John", "New York");
        Climber Mia = new Climber("Mia", "Barcelona");
        climbersThirdGroup[0] = John;
        climbersThirdGroup[1] = Mia;
        // Create mountains data
        Mountain Everest = new Mountain("Everest", "Nepal", 8849);
        Mountain Kilimanjaro = new Mountain("Kilimanjaro", "Tanzania", 5895);
        Mountain Elbrus = new Mountain("Elbrus", "Russia", 5642);
        // Fill the groups with appropriate data
        Group firstGroup = new Group("NO", climbersFirstGroup, Everest);
        Group secondGroup = new Group("YES", climbersSecondGroup, Kilimanjaro);
        Group thirdGroup = new Group("YES", climbersThirdGroup, Elbrus);
        // Add additional climbers to the free group
        Climber Artem = new Climber("Artem", "Kazan");
        Climber Sean = new Climber("Sean", "Los Angeles");
        secondGroup.addClimber(Artem);
        thirdGroup.addClimber(Sean);
    }
}
