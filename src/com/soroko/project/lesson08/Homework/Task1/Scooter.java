package com.soroko.project.lesson08.Homework.Task1;

public class Scooter extends Bicycle {
    boolean isElectric;

    public Scooter(String carNumber, int vehicleDepreciation, int maxSpeed, boolean isElectric) {
        super(carNumber, vehicleDepreciation, maxSpeed);
        this.isElectric = isElectric;
    }

    @Override
    public void repair() {
        if (vehicleDepreciation <= 0) return;
        if (isElectric) vehicleDepreciation -= 2;
        else vehicleDepreciation -= 3;
    }
}
