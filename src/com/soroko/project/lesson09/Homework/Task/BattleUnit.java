package com.soroko.project.lesson09.Homework.Task;

import static com.soroko.project.lesson09.Homework.Task.Constants.ARMY_SIZE;


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

    public abstract void attacks(Unit unit);

    public static BattleUnit createUnit(String unitType) {
        int healthPoint = 1 + (int) (Math.random() * 101);
        int movementSpeed = 1 + (int) (Math.random() * 11);
        int attackDamage = 1 + (int) (Math.random() * 101);
        if ("knight".equalsIgnoreCase(unitType)) return new Knight(healthPoint, movementSpeed, attackDamage);
        if ("infantry".equalsIgnoreCase(unitType)) return new Infantry(healthPoint, movementSpeed, attackDamage);
        throw new IllegalArgumentException();
    }

    public static BattleUnit[] createArmy(int amountOfMoney) {
        BattleUnit[] battleUnits = new BattleUnit[ARMY_SIZE];
        for (int i = 0; i < battleUnits.length; i++) {
            int healthPoint = 30 + (int) (Math.random() * 70);
            int movementSpeed = 1 + (int) (Math.random() * 10);
            int attackDamageKnight = 1 + (int) (Math.random() * 100);
            int attackDamageInfantry = 1 + (int) (Math.random() * 50);
            int typeOfUnit = 1 + (int) (Math.random() * 2);
            if (typeOfUnit == 1) {
                Infantry infantry = new Infantry(healthPoint, movementSpeed, attackDamageInfantry);
                battleUnits[i] = infantry;
            } else if (typeOfUnit == 2) {
                Knight knight = new Knight(healthPoint, movementSpeed, attackDamageKnight);
                battleUnits[i] = knight;
            }
        }
        return battleUnits;
    }

    @Override
    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint) healthPoint += 2;
        if (healthPoint > initialHealthPoint) healthPoint = initialHealthPoint;
    }

}


