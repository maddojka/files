package com.soroko.project.lesson09.Homework.Task;

abstract public class Unit {
    protected int healthPoint;
    protected int movementSpeed;
    protected int amountOfMoney;
    protected int initialHealthPoint;

    public Unit(int healthPoint) {
        setHealthPoint(healthPoint);
        this.healthPoint = healthPoint;
        initialHealthPoint = healthPoint;
    }

    public Unit(int healthPoint, int movementSpeed) {
        setHealthPoint(healthPoint);
        setMovementSpeed(movementSpeed);
        this.healthPoint = healthPoint;
        this.movementSpeed = movementSpeed;
        initialHealthPoint = healthPoint;
    }

    public Unit(int healthPoint, int movementSpeed, int amountOfMoney) {
        setHealthPoint(healthPoint);
        setMovementSpeed(movementSpeed);
        setAmountOfMoney(amountOfMoney);
        this.healthPoint = healthPoint;
        this.movementSpeed = movementSpeed;
        this.amountOfMoney = amountOfMoney;
        initialHealthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        if (healthPoint < 0 || healthPoint > 100)
            throw new IllegalArgumentException("Health should be between 0 and 100");
        this.healthPoint = healthPoint;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed < 1 || movementSpeed > 10)
            throw new IllegalArgumentException("Movement speed should be between 1 and 10");
        this.movementSpeed = movementSpeed;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        if (amountOfMoney < 1 || amountOfMoney > 1000)
            throw new IllegalArgumentException("Amount of money should be between 1 and 1000");
        this.amountOfMoney = amountOfMoney;
    }

    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint) healthPoint += 2;
        if (healthPoint > initialHealthPoint) healthPoint = initialHealthPoint;
    }

}
