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
    public void attacks(Unit unit) {
        if (unit.movementSpeed <= movementSpeed) unit.healthPoint -= attackDamage;
        if (unit instanceof Knight && ((Knight) unit).healthPoint >= 2) {
            healthPoint -= ((Knight) unit).attackDamage;
        }
        if (unit.healthPoint < 0) unit.healthPoint = 0;
        if (healthPoint < 0) healthPoint = 0;
    }

    @Override
    public String toString() {
        String name = "Рыцарь";
        return name + " здоровье: " + healthPoint + " передвижение: " + movementSpeed + " сила атаки " + attackDamage;
    }
}
