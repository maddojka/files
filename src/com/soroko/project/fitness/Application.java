package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;


public class Application {
    public static void main(String[] args) {
        // Creating gym and subscriptions data
        LocalDate current = LocalDate.now();
        Fitness sportLife = new Fitness();
        Subscription firstPerson = new Subscription
                (1001, "Разовый", current, "Сергей", "Иванов", 1994);
        Subscription secondPerson = new Subscription
                (1002, "Полный", current,
                        LocalDate.of(2025, 3, 10), "Татьяна", "Новикова", 1989);
        Subscription thirdPerson = new Subscription
                (1003, "Дневной", current,
                        LocalDate.of(2022, 2, 21), "Александр", "Аверин", 1993);
        Subscription fourthPerson = new Subscription
                (1004, "Дневной", current,
                        LocalDate.of(2025, 3, 10), "Наталья", "Петрова", 1975);
        Subscription fifthPerson = new Subscription
                (1005, "Полный", current,
                        LocalDate.of(2026, 4, 30), "Андрей", "Самойлов", 1986);
        Subscription sixthPerson = new Subscription
                (1006, "Полный", current,
                        LocalDate.of(2025, 6, 2), "Алексей", "Змейков", 2003);
        Subscription seventhPerson = new Subscription
                (1007, "Полный", current,
                        LocalDate.of(2027, 1, 9), "Владимир", "Маслов", 2000);
        Subscription eighthPerson = new Subscription
                (1008, "Полный", current,
                        LocalDate.of(2020, 2, 2), "Ксения", "Клюшина", 1995);
        Subscription ninthPerson = new Subscription
                (1009, "Разовый", current, "Екатерина", "Калязина", 1962);
        Subscription tenthPerson = new Subscription
                (1010, "Полный", current,
                        LocalDate.of(2025, 8, 31), "Сергей", "Подкопаев", 1990);
        Subscription eleventhPerson = new Subscription
                (1011, "Полный", current,
                        LocalDate.of(2019, 4, 5), "Станислав", "Хабаров", 1980);
        Subscription twelfthPerson = new Subscription
                (1012, "Полный", current,
                        LocalDate.of(2025, 10, 11), "Игорь", "Барков", 2005);
        Subscription thirteenthPerson = new Subscription
                (1013, "Полный", current,
                        LocalDate.of(2024, 4, 1), "Елена", "Иконникова", 2003);
        Subscription fourteenthPerson = new Subscription
                (1014, "Полный", current,
                        LocalDate.of(2024, 6, 10), "Светлана", "Рядовая", 1994);
        Subscription fifteenthPerson = new Subscription
                (1015, "Полный", current,
                        LocalDate.of(2024, 12, 29), "Алина", "Гусарова", 1988);
        Subscription sixteenthPerson = new Subscription
                (1016, "Полный", current,
                        LocalDate.of(2029, 3, 25), "Роман", "Пахнин", 1999);
        Subscription seventeenthPerson = new Subscription
                (1017, "Разовый", current, "Евгений", "Милов", 1962);
        Subscription eighteenthPerson = new Subscription
                (1018, "Полный", current,
                        LocalDate.of(2025, 11, 11), "Алексей", "Алексеев", 1977);
        Subscription nineteenthPerson = new Subscription
                (1019, "Полный", current,
                        LocalDate.of(2024, 7, 5), "Ирина", "Головина", 2000);
        Subscription twentiethPerson = new Subscription
                (1020, "Полный", current,
                        LocalDate.of(2024, 5, 9), "Александр", "Головин", 1985);
        Subscription twentyFirstPerson = new Subscription
                (1021, "Полный", current,
                        LocalDate.of(2023, 2, 15), "Владимир", "Морозов", 1968);
        Subscription twentySecondPerson = new Subscription
                (1022, "Полный", current,
                        LocalDate.of(2024, 9, 21), "Анастасия", "Глебова", 1989);
        Subscription twentyThirdPerson = new Subscription
                (1023, "Полный", current,
                        LocalDate.of(2025, 3, 10), "Сергей", "Писарев", 1962);
        Subscription twentyFourthPerson = new Subscription
                (1024, "Полный", current,
                        LocalDate.of(2027, 5, 31), "Мария", "Карпова", 1994);
        Subscription twentyFifthPerson = new Subscription
                (1025, "Полный", current,
                        LocalDate.of(2028, 2, 10), "Евгений", "Степанов", 2004);
        Subscription twentySixthPerson = new Subscription
                (1026, "Полный", current,
                        LocalDate.of(2025, 8, 6), "Сергей", "Писарев", 1987);
        Subscription twentySeventhPerson = new Subscription
                (1027, "Полный", current,
                        LocalDate.of(2026, 7, 26), "Дмитрий", "Петренко", 1996);
        Subscription twentyEighthPerson = new Subscription
                (1028, "Полный", current,
                        LocalDate.of(2024, 4, 12), "Артур", "Пирожков", 2002);
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
