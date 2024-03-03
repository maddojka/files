package com.soroko.project.lesson09.Homework.Task2;

import java.util.LinkedList;

public class Train {
    private String number;
    private Wagon wagon;
    private LinkedList<Wagon> wagons = new LinkedList<>();

    public Train(String number, Wagon wagon) {
        this.number = number;
        this.wagon = wagon;
    }

    public Train(String number, Wagon wagon, LinkedList<Wagon> train) {
        this.number = number;
        this.wagon = wagon;
        this.wagons = train;
    }

    public String getNumber() {
        return number;
    }

    public void removeWagon() {
        wagons.removeLast();
    }

    public void addWagon(Wagon wagon) {
        wagons.addLast(wagon);
    }

    public void addMiddle(Wagon wagon) {
        wagons.add(wagons.size() / 2, wagon);
    }

    public int amountOfWagons() {
        return wagons.size();
    }

    @Override
    public String toString() {
        return "Поезд номер " + number +
                " вагоны: " + wagons;
    }
}
