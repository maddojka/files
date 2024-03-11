package com.soroko.project.lesson09.Homework.Task;


import static com.soroko.project.lesson09.Homework.Task.Constants.*;

public class King extends Unit {
    private BattleUnit[] armyOfTheKing = new BattleUnit[ARMY_SIZE];


    public King(int healthPoint, int movementSpeed) {
        super(healthPoint, movementSpeed);
        setAmountOfMoney(TREASURY);
    }

    public void replaceUnit(BattleUnit battleUnit) {
        if (battleUnit.healthPoint < 1 && amountOfMoney >= UNIT_COST) battleUnit.healthPoint += 100;
        amountOfMoney -= UNIT_COST;
    }

    public void offensive(King king) {
        boolean FirstKingWon = false;
        int countFirstUnits = 0;
        int countSecondUnits = 0;
        for (int i = 0; i < ARMY_SIZE; i++) {
            armyOfTheKing[i].attacks(king.armyOfTheKing[i]);
        }
        for (int i = 0; i < ARMY_SIZE; i++) {
            if (armyOfTheKing[i].healthPoint == 0) countFirstUnits++;
            if (king.armyOfTheKing[i].healthPoint == 0) countSecondUnits++;
        }
        if (countFirstUnits > countSecondUnits) FirstKingWon = true;
        if (FirstKingWon && amountOfMoney > 0 && king.amountOfMoney > 0) {
            king.amountOfMoney /= HALF;
            amountOfMoney += king.amountOfMoney;
        } else {
            amountOfMoney /= HALF;
            king.amountOfMoney += amountOfMoney;
        }
    }

    public void armyRecruitment() {
        if (amountOfMoney >= ARMY_COST) {
            amountOfMoney -= ARMY_COST;
            armyOfTheKing = BattleUnit.createArmy(amountOfMoney);
        }
    }

    public BattleUnit[] getArmyOfTheKing() {
        return armyOfTheKing;
    }

    @Override
    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint && amountOfMoney > 0) {
            healthPoint += 5;
            amountOfMoney -= 2;
            if (amountOfMoney <= 0) amountOfMoney = 0;
        }
    }

    @Override
    public String toString() {
        String name = "Король";
        return name + " здоровье: " + healthPoint +
                " передвижение: " + movementSpeed +
                " количество денег: " + amountOfMoney;
    }


}


