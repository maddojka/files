package com.soroko.project.lesson08.Homework;

import com.soroko.project.lesson08.Homework.Task1.*;
import com.soroko.project.lesson08.Homework.Task2.Workshop;

public class Homework08 {
    public static void main(String[] args) {
        // Create vehicles data
        Vehicle car = new Vehicle("LGD121", 80, 220);
        Train train = new Train("587B", 6, 250, 10, true);
        Bicycle bicycle = new Bicycle("VX67DXC", 50, 40, 2, "Suburban");
        Scooter scooter = new Scooter("ST8632E", 60, 80, false);
        // Create new workshop
        Workshop repairStation = new Workshop(4);
        // Add vehicles to array
        repairStation.addVehicle(car);
        repairStation.addVehicle(train);
        repairStation.addVehicle(bicycle);
        repairStation.addVehicle(scooter);
        // repair all vehicles
        repairStation.repairAll();
    }
}
