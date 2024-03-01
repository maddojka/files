package com.soroko.project.lesson09.Homework.Task;

public class King extends Unit {
    private BattleUnit[] armyOfTheKing = new BattleUnit[20];

    public King(int healthPoint, int movementSpeed) {
        super(healthPoint, movementSpeed);
        setAmountOfMoney(500);
    }

    public BattleUnit[] getArmyOfTheKing() {
        return armyOfTheKing;
    }

    public void enlistment() {
        for (int i = 0; i < armyOfTheKing.length; i++) {
            if (i < 5) {
                Infantry infantry = new Infantry(80, 1, 50);
                armyOfTheKing[i] = infantry;
            } else {
                Knight knight = new Knight(100, 1, 100);
                armyOfTheKing[i] = knight;
            }
            amountOfMoney -= 200;
        }

    }

    public void replaceUnit(BattleUnit battleUnit) {
        if (battleUnit.healthPoint < 1) battleUnit.healthPoint += 100;
        amountOfMoney -= 12;
    }

    public void offensive(BattleUnit[] armyOfFirstKing, BattleUnit[] armyOfSecondKing, King firstKing, King secondKing) {
        boolean FirstKingWon = false;
        int countFirstUnits = 0;
        int countSecondUnits = 0;
        for (int i = 0; i < 20; i++) {
            armyOfFirstKing[i].attack(armyOfSecondKing[i]);
        }
        for (int i = 0; i < 20; i++) {
            if (armyOfFirstKing[i].healthPoint == 0) countFirstUnits++;
            if (armyOfSecondKing[i].healthPoint == 0) countFirstUnits++;
        }
        if (countFirstUnits > countSecondUnits) FirstKingWon = true;
        if (FirstKingWon) {
            secondKing.amountOfMoney /= 2;
            firstKing.amountOfMoney += secondKing.amountOfMoney;
        } else {
            firstKing.amountOfMoney /= 2;
            secondKing.amountOfMoney += firstKing.amountOfMoney;
        }
    }

    @Override
    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint && amountOfMoney > 0) {
            healthPoint += 5;
            amountOfMoney -= 2;
            if (amountOfMoney <= 0) amountOfMoney = 0;
        }
    }
}


