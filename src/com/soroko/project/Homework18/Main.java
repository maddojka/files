package com.soroko.project.Homework18;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        Task task01 =
                new Task(1, "Задача01", Task.Status.CLOSED,
                        LocalDateTime.of(2023, 5, 10, 10, 15),
                        LocalDateTime.of(2024, 3, 16, 8, 0));
        Task task02 =
                new Task(2, "Задача02", Task.Status.IN_PROGRESS,
                        LocalDateTime.of(2024, 1, 12, 12, 31),
                        LocalDateTime.of(2024, 1, 31, 23, 59));
        Task task03 =
                new Task(3, "Задача03", Task.Status.CLOSED,
                        LocalDateTime.of(2023, 12, 20, 11, 43),
                        LocalDateTime.of(2024, 2, 22, 9, 2));
        Task task04 =
                new Task(4, "Задача04", Task.Status.NEW,
                        LocalDateTime.of(2023, 3, 22, 13, 20),
                        LocalDateTime.of(2024, 6, 30, 23, 59));
        Task task05 =
                new Task(5, "Задача05", Task.Status.IN_PROGRESS,
                        LocalDateTime.of(2023, 11, 11, 11, 11),
                        LocalDateTime.of(2024, 7, 20, 23, 59));
        List<Task> taskList = new ArrayList<>() {{
            add(task01);
            add(task02);
            add(task03);
            add(task04);
            add(task05);
        }};

        // Задание №1
        // удалить задачи методом removeIf,
        // если они были созданы более месяца назад
        // и закрыты (статус CLOSED)
        System.out.println("Задание №1");
        taskList.removeIf(element -> {
            if (element == null) return false;
            Period period =
                    Period.between(element.getCreatedAt().toLocalDate(), LocalDateTime.now().toLocalDate());
            return element.getStatus() == Task.Status.CLOSED && period.getMonths() > 1;
        });
        System.out.println(taskList);

        // Задание №2
        // Перебрать список методом forEach,
        // вывести в консоль только открытые задачи,
        // которые нужно было завершить к текущему моменту
        System.out.println("Задание №2");
        taskList.forEach(element -> {
                    if (element == null) return;
                    if (element.getStatus() == Task.Status.IN_PROGRESS &&
                            element.getCloseTo().isBefore(LocalDateTime.now()))
                        System.out.println(element);
                }
        );

        // Задание №3
        // Перебрать список методом forEach,
        // вывести в консоль только задачи,
        // которые попадают в заданный диапазон дат
        System.out.println("Задание №3");
        taskList.forEach(element -> {
                    if (element == null) return;
                    LocalDateTime startDateTime = LocalDateTime.of(2023, 11, 1, 10, 0);
                    LocalDateTime endDateTime = LocalDateTime.of(2024, 2, 1, 10, 0);
                    if (element.getCreatedAt().isAfter(startDateTime) && element.getCloseTo().isBefore(endDateTime))
                        System.out.println(element);
                }
        );

        // Задание №4
        // Написать реализацию Function,
        // которая принимает на вход список задач,
        // и возвращает список с названиями
        // выполненных задач
        // в отсортированном по дате завершения виде
        System.out.println("Задание №4");
        Function<List<Task>, List<Task>> sortCompletedTasks = list -> {
            ArrayList<Task> sortedList = new ArrayList<>(list);
            sortedList.removeIf(element -> element.getStatus() != Task.Status.CLOSED);
            sortedList.sort((task1, task2) -> task1.getCloseTo().compareTo(task2.getCloseTo()));
            return sortedList;
        };
        System.out.println(sortCompletedTasks.apply(taskList));

    }

}
