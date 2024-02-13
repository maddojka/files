package lesson04;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low = 1;
        int high = 100;
        System.out.println("Загадайте число от 0 до 100 и введите любое число в консоль");
        System.out.println("Чтобы ответить Да введите - 1, Нет - введите - 0");
        int ready = scan.nextInt();
        System.out.println("Число равно 50?");
        int firstAnswer = scan.nextInt();
        if (firstAnswer == 1) {
            System.out.println("Число равно 50");

        } else if (firstAnswer == 0) {
            int count = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                System.out.println("Число больше " + mid + "?");
                int answer = scan.nextInt();
                if (answer == 1) {
                    low = mid + 1;
                }
                if (answer == 0) {
                    high = mid - 1;
                }
                count++;
                if (count == 7) {
                    System.out.println("Число равно " + mid + "?");
                    int result = scan.nextInt();
                    if (result == 1) {
                        break;
                    } else if (result == 0) {
                        low = 1;
                        high = 100;
                        count = 0;
                    }
                }
            }
        }
    }
}



