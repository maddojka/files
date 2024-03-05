package com.soroko.project.homework11.task.animals;


import java.util.Arrays;
import java.util.Objects;


public class Wolf extends WildAnimal {
    private final String[] likeToEat;
    private final String color;

    public Wolf(String name, double age, String[] likeToEat, String color) {
        super(name, age);
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        Wolf wolf = (Wolf) o;
        if (!getName().equals(((Wolf) o).getName()) || getAge() != ((Wolf) o).getAge()
                || !Arrays.equals(likeToEat, ((Wolf) o).likeToEat) || !color.equals(((Wolf) o).color))
            return false;
        else return true;
    }

}