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


        Subscription subscriprion01 = new Subscription(1001, person01, ONE_OFF, current);
        Subscription subscription02 = new Subscription
                (1002, person02, DAY_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription subscription03 = new Subscription
                (1003, person03, FULL_TIME, current, LocalDate.of(2025, 2, 21));
        Subscription subscription04 = new Subscription
                (1004, person04, DAY_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription subscription05 = new Subscription
                (1005, person05, FULL_TIME, current, LocalDate.of(2026, 4, 30));
        Subscription subscription06 = new Subscription
                (1006, person06, FULL_TIME, current, LocalDate.of(2025, 6, 2));
        Subscription subscription07 = new Subscription
                (1007, person07, FULL_TIME, current, LocalDate.of(2027, 1, 9));
        Subscription subscription08 = new Subscription
                (1008, person08, FULL_TIME, current, LocalDate.of(2020, 2, 2));
        Subscription subscription09 = new Subscription(1009, person09, ONE_OFF, current);
        Subscription subscription10 = new Subscription
                (1010, person10, FULL_TIME, current, LocalDate.of(2025, 8, 31));
        Subscription subscription11 = new Subscription
                (1011, person11, FULL_TIME, current, LocalDate.of(2019, 4, 5));
        Subscription subscription12 = new Subscription
                (1012, person12, FULL_TIME, current, LocalDate.of(2025, 10, 11));
        Subscription subscription13 = new Subscription
                (1013, person13, FULL_TIME, current, LocalDate.of(2024, 4, 1));
        Subscription subscription14 = new Subscription
                (1014, person14, FULL_TIME, current, LocalDate.of(2024, 6, 10));
        Subscription subscription15 = new Subscription
                (1015, person15, FULL_TIME, current, LocalDate.of(2024, 12, 29));
        Subscription subscription16 = new Subscription
                (1016, person16, FULL_TIME, current, LocalDate.of(2029, 3, 25));
        Subscription subscription17 = new Subscription(1017, person17, ONE_OFF, current);
        Subscription subscription18 = new Subscription
                (1018, person18, FULL_TIME, current, LocalDate.of(2025, 11, 11));
        Subscription subscription19 = new Subscription
                (1019, person19, FULL_TIME, current, LocalDate.of(2024, 7, 5));
        Subscription subscription20 = new Subscription
                (1020, person20, FULL_TIME, current, LocalDate.of(2024, 5, 9));
        Subscription subscription21 = new Subscription
                (1021, person21, FULL_TIME, current, LocalDate.of(2023, 2, 15));
        Subscription subscription22 = new Subscription
                (1022, person22, FULL_TIME, current, LocalDate.of(2024, 9, 21));
        Subscription subscription23 = new Subscription
                (1023, person23, FULL_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription subscription24 = new Subscription
                (1024, person24, FULL_TIME, current, LocalDate.of(2027, 5, 31));
        Subscription subscription25 = new Subscription
                (1025, person25, FULL_TIME, current, LocalDate.of(2028, 2, 10));
        Subscription subscription26 = new Subscription
                (1026, person26, FULL_TIME, current, LocalDate.of(2025, 8, 6));
        Subscription subscription27 = new Subscription
                (1027, person27, FULL_TIME, current, LocalDate.of(2026, 7, 26));
        Subscription subscription28 = new Subscription
                (1028, person28, FULL_TIME, current, LocalDate.of(2024, 4, 12));
        // Filling zones and checking code
        sportLife.addToDesiredZone("групповые занятия", subscriprion01);
        sportLife.addToDesiredZone("бассейн", subscriprion01);
        sportLife.addToDesiredZone("бассейн", subscriprion01);
        sportLife.addToDesiredZone("бассейн", subscription02);
        sportLife.addToDesiredZone("групповые занятия", subscription02);
        sportLife.addToDesiredZone("бассейн", subscription03);
        sportLife.addToDesiredZone("бассейн", subscription04);
        sportLife.addToDesiredZone("тренажерный зал", subscription05);
        sportLife.addToDesiredZone("бассейн", subscription05);
        sportLife.addToDesiredZone("тренажерный зал", subscription06);
        sportLife.addToDesiredZone("тренажерный зал", subscription07);
        sportLife.addToDesiredZone("тренажерный зал", subscription08);
        sportLife.addToDesiredZone("тренажерный зал", subscription09);
        sportLife.addToDesiredZone("тренажерный зал", subscription10);
        sportLife.addToDesiredZone("тренажерный зал", subscription11);
        sportLife.addToDesiredZone("тренажерный зал", subscription12);
        sportLife.addToDesiredZone("тренажерный зал", subscription13);
        sportLife.addToDesiredZone("тренажерный зал", subscription14);
        sportLife.addToDesiredZone("тренажерный зал", subscription15);
        sportLife.addToDesiredZone("тренажерный зал", subscription16);
        sportLife.addToDesiredZone("тренажерный зал", subscription17);
        sportLife.addToDesiredZone("тренажерный зал", subscription18);
        sportLife.addToDesiredZone("тренажерный зал", subscription19);
        sportLife.addToDesiredZone("тренажерный зал", subscription20);
        sportLife.addToDesiredZone("тренажерный зал", subscription21);
        sportLife.addToDesiredZone("тренажерный зал", subscription22);
        sportLife.addToDesiredZone("тренажерный зал", subscription23);
        sportLife.addToDesiredZone("тренажерный зал", subscription24);
        sportLife.addToDesiredZone("тренажерный зал", subscription25);
        sportLife.addToDesiredZone("тренажерный зал", subscription26);
        sportLife.addToDesiredZone("тренажерный зал", subscription27);
        sportLife.addToDesiredZone("тренажерный зал", subscription28);
        // printing zones
        sportLife.printGroups();
        // initializing zones
        Fitness.initializeZone(sportLife.getGymZone());
        Fitness.initializeZone(sportLife.getPoolZone());
        Fitness.initializeZone(sportLife.getGroupZone());
        sportLife.printGroups();
    }

}
