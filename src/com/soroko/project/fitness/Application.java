package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;


public class Application {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        LocalDate firstUserSubExpiration = LocalDate.of(2025, 3, 10);
        LocalDate secondUserSybExpiration = LocalDate.of(2022, 2, 21);
        Subscription firstUser = new Subscription
                (1001, "Разовый", current, "Сергей", "Иванов", 1994);
        Fitness sportLife = new Fitness();
        Subscription secondUser = new Subscription
                (1002, "Полный", current, firstUserSubExpiration, "Татьяна", "Новикова", 1989);
        Subscription thirdUser = new Subscription
                (1003, "Дневной", current, "Сергей", "Михайлов", 1962);
        sportLife.addToDesiredZone("бассейн", secondUser);
        sportLife.printGroups();
        sportLife.addToDesiredZone("бассейн", secondUser);
        Fitness.initializeZone(sportLife.getGroupZone());
        sportLife.printGroups();
    }

}
