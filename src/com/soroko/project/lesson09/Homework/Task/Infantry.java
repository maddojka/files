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
    public void attacks(Unit unit) {
        if (healthPoint > 5) unit.healthPoint -= attackDamage;
        else if (healthPoint <= 5 && healthPoint > 0) unit.healthPoint -= (attackDamage * 2);
        if (unit instanceof Knight && ((Knight) unit).healthPoint >= 1) {
            healthPoint -= ((Knight) unit).attackDamage;
        }
        if (unit.healthPoint < 0) unit.healthPoint = 0;
        if (healthPoint < 0) healthPoint = 0;
    }

    @Override
    public String toString() {
        String name = "Пехотинец";
        return name + " здоровье: " + healthPoint + " передвижение: " + movementSpeed + " сила атаки " + attackDamage;
    }
}
