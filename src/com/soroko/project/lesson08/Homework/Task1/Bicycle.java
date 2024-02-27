package com.soroko.project.lesson08.Homework.Task1;

public class Bicycle extends Vehicle {
    private int amountOfWheels = 2;
    private String type = "Urban";

    public Bicycle(String carNumber, int vehicleDepreciation, int maxSpeed) {
        super(carNumber, vehicleDepreciation, maxSpeed);
    }

    public Bicycle(String carNumber, int amountOfWheels, String type) {
        super(carNumber);
        setAmountOfWheels(amountOfWheels);
        this.amountOfWheels = amountOfWheels;
        this.type = type;
    }

    public Bicycle(String carNumber, int vehicleDepreciation, int amountOfWheels, String type) {
        super(carNumber, vehicleDepreciation);
        setAmountOfWheels(amountOfWheels);
        this.amountOfWheels = amountOfWheels;
        this.type = type;
    }

    public Bicycle(String carNumber, int vehicleDepreciation, int maxSpeed, int amountOfWheels, String type) {
        super(carNumber, vehicleDepreciation, maxSpeed);
        setAmountOfWheels(amountOfWheels);
        this.amountOfWheels = amountOfWheels;
        this.type = type;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    private void setAmountOfWheels(int amountOfWheels) {
        if (amountOfWheels < 2 || amountOfWheels > 10)
            throw new IllegalArgumentException(" оличество колес должно быть от 2 до 10");
        this.amountOfWheels = amountOfWheels;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        if ("".equals(type))
            throw new IllegalArgumentException("“ип транспорта не может быть пустой строкой");
        this.type = type;
    }

    @Override
    public void repair() {
        super.repair();
    }
}
