package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

import static com.soroko.project.fitness.TypeOfSubscription.*;


public class Application {
    public static void main(String[] args) {
        // Creating gym and subscriptions data
        LocalDate current = LocalDate.now();
        Fitness sportLife = new Fitness();
        PersonData person01 = new PersonData("Сергей", "Иванов", 1994);
        PersonData person02 = new PersonData("Татьяна", "Новикова", 1989);
        PersonData person03 = new PersonData("Александр", "Рудых", 1992);
        PersonData person04 = new PersonData("Наталья", "Петрова", 1975);
        PersonData person05 = new PersonData("Андрей", "Самойлов", 1986);
        PersonData person06 = new PersonData("Алексей", "Змейков", 2003);
        PersonData person07 = new PersonData("Владимир", "Маслов", 2000);
        PersonData person08 = new PersonData("Ксения", "Клюшина", 1995);
        PersonData person09 = new PersonData("Екатерина", "Калязина", 1962);
        PersonData person10 = new PersonData("Сергей", "Подкопаев", 1990);
        PersonData person11 = new PersonData("Станислав", "Хабаров", 1980);
        PersonData person12 = new PersonData("Игорь", "Барков", 2005);
        PersonData person13 = new PersonData("Елена", "Иконникова", 2003);
        PersonData person14 = new PersonData("Светлана", "Рядовая", 1994);
        PersonData person15 = new PersonData("Алина", "Гусарова", 1988);
        PersonData person16 = new PersonData("Роман", "Пахнин", 1999);
        PersonData person17 = new PersonData("Евгений", "Милов", 1962);
        PersonData person18 = new PersonData("Алексей", "Алексеев", 1977);
        PersonData person19 = new PersonData("Ирина", "Головина", 2000);
        PersonData person20 = new PersonData("Александр", "Головин", 1985);
        PersonData person21 = new PersonData("Владимир", "Морозов", 1968);
        PersonData person22 = new PersonData("Анастасия", "Глебова", 1989);
        PersonData person23 = new PersonData("Сергей", "Писарев", 1962);
        PersonData person24 = new PersonData("Мария", "Карпова", 1994);
        PersonData person25 = new PersonData("Евгений", "Степанов", 2004);
        PersonData person26 = new PersonData("Сергей", "Писарев", 1987);
        PersonData person27 = new PersonData("Дмитрий", "Тишкевич", 1996);
        PersonData person28 = new PersonData("Артур", "Пирожков", 2002);


        Subscription firstPerson = new Subscription(1001, person01, ONE_OFF, current);
        Subscription secondPerson = new Subscription
                (1002, person02, FULL_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription thirdPerson = new Subscription
                (1003, person03, FULL_TIME, current, LocalDate.of(2025, 2, 21));
        Subscription fourthPerson = new Subscription
                (1004, person04, DAY_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription fifthPerson = new Subscription
                (1005, person05, FULL_TIME, current, LocalDate.of(2026, 4, 30));
        Subscription sixthPerson = new Subscription
                (1006, person06, FULL_TIME, current, LocalDate.of(2025, 6, 2));
        Subscription seventhPerson = new Subscription
                (1007, person07, FULL_TIME, current, LocalDate.of(2027, 1, 9));
        Subscription eighthPerson = new Subscription
                (1008, person08, FULL_TIME, current, LocalDate.of(2020, 2, 2));
        Subscription ninthPerson = new Subscription(1009, person09, ONE_OFF, current);
        Subscription tenthPerson = new Subscription
                (1010, person10, FULL_TIME, current, LocalDate.of(2025, 8, 31));
        Subscription eleventhPerson = new Subscription
                (1011, person11, FULL_TIME, current, LocalDate.of(2019, 4, 5));
        Subscription twelfthPerson = new Subscription
                (1012, person12, FULL_TIME, current, LocalDate.of(2025, 10, 11));
        Subscription thirteenthPerson = new Subscription
                (1013, person13, FULL_TIME, current, LocalDate.of(2024, 4, 1));
        Subscription fourteenthPerson = new Subscription
                (1014, person14, FULL_TIME, current, LocalDate.of(2024, 6, 10));
        Subscription fifteenthPerson = new Subscription
                (1015, person15, FULL_TIME, current, LocalDate.of(2024, 12, 29));
        Subscription sixteenthPerson = new Subscription
                (1016, person16, FULL_TIME, current, LocalDate.of(2029, 3, 25));
        Subscription seventeenthPerson = new Subscription(1017, person17, ONE_OFF, current);
        Subscription eighteenthPerson = new Subscription
                (1018, person18, FULL_TIME, current, LocalDate.of(2025, 11, 11));
        Subscription nineteenthPerson = new Subscription
                (1019, person19, FULL_TIME, current, LocalDate.of(2024, 7, 5));
        Subscription twentiethPerson = new Subscription
                (1020, person20, FULL_TIME, current, LocalDate.of(2024, 5, 9));
        Subscription twentyFirstPerson = new Subscription
                (1021, person21, FULL_TIME, current, LocalDate.of(2023, 2, 15));
        Subscription twentySecondPerson = new Subscription
                (1022, person22, FULL_TIME, current, LocalDate.of(2024, 9, 21));
        Subscription twentyThirdPerson = new Subscription
                (1023, person23, FULL_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription twentyFourthPerson = new Subscription
                (1024, person24, FULL_TIME, current, LocalDate.of(2027, 5, 31));
        Subscription twentyFifthPerson = new Subscription
                (1025, person25, FULL_TIME, current, LocalDate.of(2028, 2, 10));
        Subscription twentySixthPerson = new Subscription
                (1026, person26, FULL_TIME, current, LocalDate.of(2025, 8, 6));
        Subscription twentySeventhPerson = new Subscription
                (1027, person27, FULL_TIME, current, LocalDate.of(2026, 7, 26));
        Subscription twentyEighthPerson = new Subscription
                (1028, person28, FULL_TIME, current, LocalDate.of(2024, 4, 12));
        // Filling zones and checking code
        sportLife.addToDesiredZone("групповые занятия", firstPerson);
        sportLife.addToDesiredZone("бассейн", firstPerson);
        sportLife.addToDesiredZone("бассейн", firstPerson);
        sportLife.addToDesiredZone("групповые занятия", secondPerson);
        sportLife.addToDesiredZone("тренажерный зал", secondPerson);
        sportLife.addToDesiredZone("тренажерный зал", thirdPerson);
        sportLife.addToDesiredZone("бассейн", fourthPerson);
        sportLife.addToDesiredZone("тренажерный зал", fifthPerson);
        sportLife.addToDesiredZone("бассейн", fifthPerson);
        sportLife.addToDesiredZone("тренажерный зал", sixthPerson);
        sportLife.addToDesiredZone("тренажерный зал", seventhPerson);
        sportLife.addToDesiredZone("тренажерный зал", eighthPerson);
        sportLife.addToDesiredZone("тренажерный зал", ninthPerson);
        sportLife.addToDesiredZone("тренажерный зал", tenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", eleventhPerson);
        sportLife.addToDesiredZone("тренажерный зал", twelfthPerson);
        sportLife.addToDesiredZone("тренажерный зал", thirteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", fourteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", fifteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", sixteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", seventeenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", eighteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", nineteenthPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentiethPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentyFirstPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentySecondPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentyThirdPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentyFourthPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentyFifthPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentySixthPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentySeventhPerson);
        sportLife.addToDesiredZone("тренажерный зал", twentyEighthPerson);
        // printing zones
        sportLife.printGroups();
        // initializing zones
        Fitness.initializeZone(sportLife.getGymZone());
        Fitness.initializeZone(sportLife.getPoolZone());
        Fitness.initializeZone(sportLife.getGroupZone());
        sportLife.printGroups();
    }

}
