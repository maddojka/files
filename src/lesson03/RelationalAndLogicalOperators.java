package lesson03;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // операторы сравнения
        // > больше / >= больше или равно
        // < меньше / <=меньше или равно
        //  == равно / != не равно
        int books = 30, students = 22;
        boolean result = books < students;
        result = books == students;
        result = books != students;
        // Логические операторы
        // && и - вернет true, если оба операнда true
        // || или - вернет true, если хотя бы один операнд - true
        // ! не - меняет булевое значение на противоположное
        int maxStudents = 100;
        result = students < maxStudents && students <= books;
        result = students > maxStudents || students > books;

        boolean isActive = true, isStable = false;
        result = !isActive; //false
        result = !(isActive && isStable); //true
        result = !(students < maxStudents && students <= books); //false
        // ускоренное вычисление
        // Тернарный оператор :?
        int startYear = 2024, endYear = 2029;
        // вычисляет результат в зависимости от условия
        int validationResult = endYear > startYear ? endYear - startYear : -1;
        int sum = 1337;
        double sumResult = sum > 1000 ? sum * 90.0 / 100 : sum;
        System.out.println(sumResult); // 1203
        // возвращает какое то значение в зависимости от условия
        // переменная должна соответствовать тому типу переменных, которые прописаны в условиях
        boolean requestResult = false;
        if (requestResult)
            System.out.println("Запрос успешно обработан");
        else
            System.out.println("Обработка запроса завершилась неудачей"); // обязательно должен быть пробел или таб на новой строке
//        для удобства
        // если скобки в одном блоке имеются, то должны быть и во всех остальных
        int a = 1;
        int b = 3;
        int c = 1;
        if (a > b && b > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }
        int currentScoreValue = 80;
        if (currentScoreValue >= 90) System.out.println("Первое место");
        else if (currentScoreValue >= 80 && currentScoreValue <= 89) System.out.println("Второе место");
        else System.out.println("Нет призового места");

        int monthNumber = 6;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("неверный ввод");
        }

        char seasonLetter = switch (monthNumber) {
            case 12, 1, 2 -> {
                System.out.println("Зима");
                yield 'z'; // обязателен при фигурных скобках
            }
            case 3, 4, 5 -> 'v';
            case 6, 7, 8 -> 'l';
            case 9, 10, 11 -> 'o';
            default -> 'e'; // обязательный при присваивании
        };
        // если одна инструкция то не нужны фигурные скобки, если несколько инструкций - обязательно
        System.out.println(seasonLetter);
        int floorNumber = 4;
        switch (floorNumber) {
            case 1, 2 -> System.out.println("7 квартир");
            case 3, 4 -> System.out.println("5 квартир");
            case 5 -> System.out.println("2 квартиры");
            default -> System.out.println("Этаж отсутствует");
        }
    }

}

