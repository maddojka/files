package com.soroko.project.Homework17;

public class Bus extends Vehicle{
    private boolean wifi;

    public Bus(String number) {
        super(number);
    }

    public boolean isWifi() {
        return wifi;
    }

    @Override
    public void repair() {
        super.repair();
        if (!wifi) wifi = true;
    }

    @Override
    public void breakDown() {
        this.wifi = false;
        incLevelOfWare(5);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "wifi=" + wifi +
                ", number='" + number + '\'' +
                ", levelOfWare=" + levelOfWare +
                '}';
    }
}
