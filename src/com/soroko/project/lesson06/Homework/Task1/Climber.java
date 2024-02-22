package com.soroko.project.lesson06.Homework.Task1;

public class Climber {
    private String name;
    private String address;

    public Climber() {
    }

    public Climber(String name, String address) {
        if (name.length() < 3)
            throw new IllegalArgumentException("Name of the climber is less than 3 characters");
        if (address.length() < 5)
            throw new IllegalArgumentException("Address of the climber is less than 5 characters");
        this.name = name;
        this.address = address;
    }
}
