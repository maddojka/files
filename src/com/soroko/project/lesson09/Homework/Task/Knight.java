package com.soroko.project.lesson09.Homework.Task;

public class Knight extends BattleUnit {


    public Knight(int healthPoint, int movementSpeed, int attackDamage) {
        super(healthPoint, movementSpeed, attackDamage);
    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void attack(Unit unit) {
        if (unit.movementSpeed <= movementSpeed && unit.healthPoint > 0 && healthPoint >= 1) unit.healthPoint -= attackDamage;
        else  unit.healthPoint = 0;
    }

}
