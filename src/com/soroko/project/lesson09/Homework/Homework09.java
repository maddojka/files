package com.soroko.project.lesson09.Homework;

import com.soroko.project.lesson09.Homework.Task.BattleUnit;
import com.soroko.project.lesson09.Homework.Task.Healer;
import com.soroko.project.lesson09.Homework.Task.King;
import com.soroko.project.lesson09.Homework.Task.Knight;

import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {
        // Create kings data
        King Artur = new King(100, 1);
        King Ludovic = new King(80, 1);
        // Add battle units to array
        Artur.enlistment();
        Ludovic.enlistment();
        // Create healer data
        Healer healerOfArtur = new Healer(50, 2);
        Healer healerOfLudovic = new Healer(50, 2);
        // Artur attacks Ludovic
        Artur.offensive(Artur.getArmyOfTheKing(), Ludovic.getArmyOfTheKing(), Artur, Ludovic);
        // Ludovic attacks Artur
        Ludovic.offensive(Ludovic.getArmyOfTheKing(), Artur.getArmyOfTheKing(), Ludovic, Artur);
        // Some ordinary infantry attacks king Artur
        Ludovic.getArmyOfTheKing()[7].attack(Artur);
        // However there is a healer
        healerOfArtur.heal(Artur);
        // Artur's army try to rest after the battle
        for (int i = 0; i < 20; i++) {
            Artur.getArmyOfTheKing()[i].rest();
        }
        // Ludovic's healer heals all battle units
        for (int i = 0; i < 20; i++) {
            healerOfLudovic.heal(Ludovic.getArmyOfTheKing()[i]);
        }
    }
}
