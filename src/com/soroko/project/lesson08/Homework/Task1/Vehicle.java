package com.soroko.project.lesson08.Homework.Task1;

public class Vehicle {
    private String carNumber;
    protected int vehicleDepreciation;
    private int maxSpeed = 120;

    public Vehicle() {
    }

    public Vehicle(String carNumber) {
        setCarNumber(carNumber);
        this.carNumber = carNumber;
    }

    public Vehicle(String carNumber, int vehicleDepreciation) {
        setCarNumber(carNumber);
        setVehicleDepreciation(vehicleDepreciation);
        this.carNumber = carNumber;
        this.vehicleDepreciation = vehicleDepreciation;
    }

    public Vehicle(String carNumber, int vehicleDepreciation, int maxSpeed) {
        setCarNumber(carNumber);
        setVehicleDepreciation(vehicleDepreciation);
        setMaxSpeed(maxSpeed);
        this.carNumber = carNumber;
        this.vehicleDepreciation = vehicleDepreciation;
        this.maxSpeed = maxSpeed;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        if ("".equals(carNumber)) throw new IllegalArgumentException("Номер не может быть пустой строкой");
        this.carNumber = carNumber;
    }

    public int getVehicleDepreciation() {
        return vehicleDepreciation;
    }

    public void setVehicleDepreciation(int vehicleDepreciation) {
        if (vehicleDepreciation < 0 || vehicleDepreciation > 100)
            throw new IllegalArgumentException("Износ должен быть от 0 до 100");
        this.vehicleDepreciation = vehicleDepreciation;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 10 || maxSpeed > 1000) throw new IllegalArgumentException("Скорость должна быть от 10 до 1000");
        this.maxSpeed = maxSpeed;
    }

    public void repair() {
        if (vehicleDepreciation <= 0) return;
        vehicleDepreciation -= 1;
    }
}
