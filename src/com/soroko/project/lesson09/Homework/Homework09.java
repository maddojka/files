package com.soroko.project.lesson09.Homework;

import com.soroko.project.lesson09.Homework.Task.*;

import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {
        // Create kings data
        King Artur = new King(100, 1);
        King Ludovic = new King(80, 1);
        // Create armies
        Artur.armyRecruitment();
        Ludovic.armyRecruitment();
        // Check armies data
        System.out.println(Artur.getAmountOfMoney());
        System.out.println(Ludovic.getAmountOfMoney());
        // Add battle units to array
        System.out.println(Arrays.toString(Artur.getArmyOfTheKing()));
        System.out.println(Arrays.toString(Ludovic.getArmyOfTheKing()));
        // Create healer data
        Healer healerOfArtur = new Healer(50, 2);
        Healer healerOfLudovic = new Healer(50, 2);
        // Artur attacks Ludovic
        Artur.offensive(Ludovic);
        // Ludovic attacks Artur
        Ludovic.offensive(Artur);
        System.out.println(Arrays.toString(Artur.getArmyOfTheKing()));
        System.out.println(Arrays.toString(Ludovic.getArmyOfTheKing()));
        // Some ordinary infantry attacks king Artur
        Ludovic.getArmyOfTheKing()[0].attacks(Artur);
        System.out.println(Artur.getHealthPoint());
        // However there is a healer
        healerOfArtur.heal(Artur);
        System.out.println(Artur.getHealthPoint());
        // Artur's army try to rest after the battle
        for (int i = 0; i < Artur.getArmyOfTheKing().length; i++) {
            Artur.getArmyOfTheKing()[i].rest();
        }
        // Ludovic's healer heals all battle units
        for (int i = 0; i < Ludovic.getArmyOfTheKing().length; i++) {
            healerOfLudovic.heal(Ludovic.getArmyOfTheKing()[i]);
        }
        System.out.println(Arrays.toString(Artur.getArmyOfTheKing()));
        System.out.println(Arrays.toString(Ludovic.getArmyOfTheKing()));
    }
}
