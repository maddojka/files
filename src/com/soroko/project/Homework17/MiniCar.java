package com.soroko.project.Homework17;

public class MiniCar extends Car implements Runnable{
    public MiniCar(Color color, String number) {
        super(color, number);
    }

    @Override
    public void run() {
        incLevelOfWare(1);
    }



    @Override
    public String toString() {
        return "MiniCar{" +
                "color=" + getColor() +
                ", number='" + number + '\'' +
                ", levelOfWare=" + levelOfWare +
                '}';
    }
}