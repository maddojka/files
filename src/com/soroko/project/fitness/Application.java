package com.soroko.project.fitness;

import java.time.LocalDate;


public class Application {
    public static void main(String[] args) {
        LocalDate current = LocalDate.now();
        Subscription oneOff = new Subscription
                (1, "Разовый", current, "Сергей", "Иванов", 1994);
        Fitness sportLife = new Fitness();
        //   sportLife.addToGymZone(oneOff);
        Subscription fullTime = new Subscription
                (2, "Полный", current, "Татьяна", "Новикова", 1989);
        Subscription dayTime = new Subscription
                (3, "Дневной", current, "Сергей", "Михайлов", 1962);
        sportLife.addToDesiredZone("", dayTime);
       // sportLife.addToGymZone(oneOff);
      //  sportLife.addToGymZone(fullTime);
      //  sportLife.addToGymZone(dayTime);
      //  Fitness.initializeZone(sportLife.getGroupZone());
     //   Fitness.initializeZone(sportLife.getGymZone());
     //   System.out.println(Arrays.toString(sportLife.getGymZone()));
        sportLife.printGroups();



    }

}
