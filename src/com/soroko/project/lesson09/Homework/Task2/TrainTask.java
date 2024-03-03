package com.soroko.project.lesson09.Homework.Task2;

import java.util.LinkedList;

public class TrainTask {
    public static void main(String[] args) {

        LinkedList wagons = new LinkedList<>();
        // Create locomotive
        Wagon locomotive = new Wagon("Звезда", "пассажирский", 2);
        Train train = new Train("91B", locomotive, wagons);
        // Create the data of wagons
        Wagon wagon01 = new Wagon("01", "пассажирский", 60, locomotive);
        Wagon wagon02 = new Wagon("02", "пассажирский", 50, wagon01);
        Wagon wagon03 = new Wagon("03", "пассажирский", 70, wagon02);
        Wagon wagon04 = new Wagon("04", "пассажирский", 60, wagon03);
        Wagon wagon05 = new Wagon("05", "пассажирский", 60, wagon04);
        Wagon wagon06 = new Wagon("06", "пассажирский", 60, wagon05);
        Wagon wagonRestaurant = new Wagon("00", "ресторан", 20, wagon02);
        // Add wagons
        wagons.add(locomotive);
        wagons.add(wagon01);
        wagons.add(wagon02);
        wagons.add(wagon03);
        wagons.add(wagon04);
        wagons.add(wagon05);
        // add wagon restaurant in the middle
        train.addMiddle(wagonRestaurant);
        // remove last wagon
        train.removeWagon();
        // add last wagon
        train.addWagon(wagon06);
        System.out.println(train);
        System.out.println("Количество вагонов " + train.amountOfWagons());
    }
}
