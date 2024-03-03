package com.soroko.project.lesson09.Homework.Task2;

import java.util.LinkedList;

public class TrainTask {
    public static void main(String[] args) {

        Wagon[] wagons;
        // Create locomotive
        Wagon locomotive = new Wagon("Звезда", "пассажирский", 2);
        Train train = new Train("91B", locomotive, 0);
        // Create the data of wagons
        Wagon wagon01 = new Wagon("01", "пассажирский", 60, locomotive);
        Wagon wagon02 = new Wagon("02", "пассажирский", 50, wagon01);
        Wagon wagon03 = new Wagon("03", "пассажирский", 70, wagon02);
        Wagon wagon04 = new Wagon("04", "пассажирский", 60, wagon03);
        Wagon wagon05 = new Wagon("05", "пассажирский", 60, wagon04);
        Wagon wagon06 = new Wagon("06", "пассажирский", 60, wagon05);
        Wagon wagonRestaurant = new Wagon("00", "ресторан", 20);
        // Add wagons
        train.addWagon(locomotive);
        train.addWagon(wagon01);
        train.addWagon(wagon02);
        train.addWagon(wagon03);
        train.addWagon(wagon04);
        train.addWagon(wagon05);
        train.removeWagon();

        // add wagon restaurant in the middle
        System.out.println(wagon04.getWagon());
        System.out.println();
        train.addMiddle(wagonRestaurant);
        // Print wagons
        train.print();
        System.out.println();
        System.out.println(wagon04.getWagon());
        System.out.println("Количество вагонов " + train.amountOfWagons());
    }
}
