package lesson03;

public class Homework {
    public static void main(String[] args) {
        // Задача #1
        int randomNumber = (int) (10 + Math.random() * 501);
        System.out.println((randomNumber > 25) && (randomNumber < 200)
            ? "Число " + randomNumber + " содержится в интервале (25;200)"
                : "Число " + randomNumber + " не содержится в интервале (25;200)");
        // Задача #2
        int x = -1;
        int y = 2;

        if ((x > 0) && (y > 0)) {
            System.out.println("1 четверть");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("2 четверть");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("3 четверть");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("4 четверть");
        } else {
            System.out.println("Начало координат");
        }
        // Задача #3
        int monthNumber = 2;
        int isLeap = 2024;

        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12  -> System.out.println("31 день");
            case 2 -> System.out.println(isLeap % 4 == 0 ? "29 дней" : "28 дней");
            case 4, 6, 9, 11 -> System.out.println("30 дней");
            default -> System.out.println("неверное количество");
        }
        // Задача #4
        int couponNumber = 6666;
        int resultSum = 1337;

        switch (couponNumber) {
            case 1111, 4444, 9999  -> System.out.println("Скидка 10% - " + (resultSum * 90 / 100) + " руб.");
            case 3333, 7777 -> System.out.println("Скидка 20% - " + (resultSum * 80 / 100) + " руб.");
            case 5555 -> System.out.println("Скидка 30% - " + (resultSum * 70 / 100) + " руб.");
            default -> System.out.println("Скидка не предусмотрена - " + resultSum + " руб.");
        }
    }
}