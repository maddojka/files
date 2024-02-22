package com.soroko.project.lesson06.Homework.Task1;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain() {
    }

    public Mountain(String name, String country, int height) {
        if (name.length() < 4)
            throw new IllegalArgumentException("Name of the mountain is less than 4 characters");
        if (country.length() < 4)
            throw new IllegalArgumentException("Name of the country is less than 4 characters");
        if (height < 100)
            throw new IllegalArgumentException("Height of the mountain is less than 100 meters");
        this.name = name;
        this.country = country;
        this.height = height;
    }
}
