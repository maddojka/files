package com.soroko.project.lesson08.Homework.Task1;

public class Workshop {
    private Vehicle vehicles[];
    private int index;

    public Workshop(int numberOfVehicles) {
        if (numberOfVehicles <= 0)
            throw new IllegalArgumentException("кол-во транспортных средств - положительно число");
        this.vehicles = new Vehicle[numberOfVehicles];
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) throw new IllegalArgumentException("добавьте транспортное средство");
        vehicles[index] = vehicle;
        if (index == vehicles.length) return;
        index++;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void repairAll() {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].repair();
            vehicles[i] = null;
        }
    }
}
