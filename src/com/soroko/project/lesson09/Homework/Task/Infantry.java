package com.soroko.project.lesson09.Homework.Task;

public class Infantry extends BattleUnit {

    public Infantry(int healthPoint, int movementSpeed, int attackDamage) {
        super(healthPoint, movementSpeed, attackDamage);
    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void attack(Unit unit) {
        if (unit.healthPoint > 0) unit.healthPoint -= attackDamage;
        else unit.healthPoint = 0;
    }
}
