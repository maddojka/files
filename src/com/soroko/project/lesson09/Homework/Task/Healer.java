package com.soroko.project.lesson09.Homework.Task;

public class Healer extends Unit implements Healing {

    public Healer(int healthPoint, int movementSpeed) {
        super(healthPoint, movementSpeed);
    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void heal(Unit unit) {
        if (unit.healthPoint > 0 && unit.healthPoint < unit.initialHealthPoint) unit.healthPoint += 100;
        if (unit.healthPoint > unit.initialHealthPoint) unit.healthPoint = unit.initialHealthPoint;
    }
}
