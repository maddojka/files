package com.soroko.project.homework11.task.animals;

public class WildAnimal extends Animal {
    private int strength;

    public WildAnimal(String name, double age) {
        super(name, age);
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
