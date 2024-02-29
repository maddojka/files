package com.soroko.project.lesson09.Homework.Task;

abstract public class BattleUnit extends Unit {
    protected int attackDamage;

    public BattleUnit(int healthPoint, int movementSpeed, int attackDamage) {
        super(healthPoint, movementSpeed);
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        if (attackDamage < 1 || attackDamage > 100)
            throw new IllegalArgumentException("Attack damage should be between 1 and 100");
        this.attackDamage = attackDamage;
    }

    @Override
    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint) healthPoint += 2;
        if (healthPoint > initialHealthPoint) healthPoint = initialHealthPoint;
    }

    public abstract void attack(Unit unit);


}


