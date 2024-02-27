package com.soroko.project.lesson08.Homework.Task1;

public class Train extends Vehicle {
    private int amountOfWagons;
    private boolean climateControl;

    public Train(String carNumber, int amountOfWagons, boolean climateControl) {
        super(carNumber);
        setAmountOfWagons(amountOfWagons);
        this.amountOfWagons = amountOfWagons;
        this.climateControl = climateControl;
    }

    public Train(String carNumber, int vehicleDepreciation, int amountOfWagons, boolean climateControl) {
        super(carNumber, vehicleDepreciation);
        setAmountOfWagons(amountOfWagons);
        this.amountOfWagons = amountOfWagons;
        this.climateControl = climateControl;
    }

    public Train(String carNumber, int vehicleDepreciation, int maxSpeed, int amountOfWagons, boolean climateControl) {
        super(carNumber, vehicleDepreciation, maxSpeed);
        setAmountOfWagons(amountOfWagons);
        this.amountOfWagons = amountOfWagons;
        this.climateControl = climateControl;
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        if (amountOfWagons < 1 || amountOfWagons > 100)
            throw new IllegalArgumentException(" оличество вагонов должно быть от 1 до 100");
        this.amountOfWagons = amountOfWagons;
    }

    public boolean isClimateControl() {
        return climateControl;
    }

    public void setClimateControl(boolean climateControl) {
        this.climateControl = climateControl;
    }

    @Override
    public void repair() {
        if (vehicleDepreciation <= 0) return;
        if (vehicleDepreciation > 7) vehicleDepreciation -= 1;
        else vehicleDepreciation -= 2;
    }
}
