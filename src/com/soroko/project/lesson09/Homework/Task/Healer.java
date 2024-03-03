package com.soroko.project.lesson09.Homework.Task;

public class Healer extends Unit implements Healable {
    private String name = "Целитель";

    public Healer(int healthPoint, int movementSpeed) {
        super(healthPoint, movementSpeed);
    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void heal(Unit unit) {
        if (unit.healthPoint > 0 && unit.healthPoint < unit.initialHealthPoint)
            unit.healthPoint = unit.initialHealthPoint;
    }

    @Override
    public String toString() {
        return name + " здоровье: " + healthPoint + " передвижение: " + movementSpeed;
    }
}
