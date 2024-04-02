package com.soroko.project.Homework21;


import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.soroko.project.Homework21.Task.Status.*;
import static java.util.stream.Collectors.*;


public class TaskTracker {
    private String name;
    private Set<TaskToParticipant> tasks = new HashSet<>();

    // taskPredicates - условия добавления задач. Тип данных определить самостоятельно +
    // условие добавление задачи по умолчанию: задача должна быть открытой +
    // может быть заменено методом taskSettings +
    private Predicate<Task> taskPredicates = task -> task.getStatus().isPresent()
            && (task.getStatus().get() == IN_PROGRESS
            || task.getStatus().get() == NEW);
    private final Predicate<Task> initialTaskPredicate = taskPredicates;
    // participantPredicates - условия добавления исполнителей. Тип данных определить самостоятельно +
    // условие добавление исполнителя по умолчанию: исполнитель должен быть +
    // доступен по свойству active +
    // может быть заменено методом participantSettings +
    private Predicate<Participant> participantPredicates = Participant::isActive;

    private Predicate<Participant> initialParticipantPredicates = participantPredicates;

    private TaskTracker(String name) {
        if ("".equals(name)) throw new IllegalArgumentException("Имя трекера не может быть пустой строкой");
        this.name = name;
    }

    // конструктор не должен быть доступен вне класса +
    // создание TaskTracker происходит вызовом статического метода withTitle, +
    // метод принимает на вход название создает и возвращает экземпляр TaskTracker +
    public static TaskTracker withTitle(String name) {
        Objects.requireNonNull(name);
        return new TaskTracker(name);
    }

    // TaskPredicate - функциональный интерфейс +
    // его абстрактный метод принимает задачу, возвращает ture или false +
    public TaskTracker taskSettings(Predicate<Task> predicates) {

        // predicates - массив типа TaskPredicate -
        // условия добавления задач, +
        // например, predicates - задача должна быть срочной +
        //                      - задача должна быть новой +
        //                      - задача должна быть просроченной +
        // все условия хранятся в TaskPredicate +
        Objects.requireNonNull(predicates);
        this.taskPredicates = predicates;
        return this;
    }


    // ParticipantPredicate - функциональный интерфейс +
    // его абстрактный метод принимает задачу, возвращает ture или false +
    public TaskTracker participantSettings(Predicate<Participant> predicates) {
        // predicates - массив типа ParticipantPredicate - +
        // условия добавления исполнителей
        // например, predicates - опыт работы выше 5
        //                      - исполнитель должен быть доступен
        //                      - у исполнителя еще нет задач
        // все условия хранятся в participantPredicates +
        Objects.requireNonNull(predicates);
        this.participantPredicates = predicates;
        return this;
    }

    public TaskTracker add(Task task, Participant participant) {
        Objects.requireNonNull(task);
        Objects.requireNonNull(participant);
        // создается TaskToParticipant, если задача (task) и исполнитель (participant)
        // удовлетворяют требованиям taskPredicates и participantPredicates
        // TaskToParticipant добавляется в tasks +
        if (taskPredicates.test(task) && participantPredicates.test(participant)) {
            tasks.add(new TaskToParticipant(participant, task, 0));
        }
        return this;
    }

    // возвращает статистику по текущему состоянию трекера
    public TasksTrackerStatistic getStatistics() {
        // реализовать метод, используя collectors api
        // посмотрите методы teeing() и reducing()
        long numberOfClosed = 0L;
        long numberOfParticipants = 0L;
        long numberOfFailed = 0L;
        long numberOfInProgress = 0L;

        if (tasks != null) {
            numberOfClosed = tasks.stream()
                    .collect(filtering(taskToParticipant -> taskToParticipant.getTask().getStatus().orElseThrow() == CLOSED,
                            Collectors.counting()));
            numberOfParticipants = tasks.stream()
                    .map(TaskToParticipant::getParticipant)
                    .collect(Collectors.counting());
            numberOfFailed = tasks.stream()
                    .map(TaskToParticipant::getTask)
                    .collect(filtering(task -> task.getCloseTo().orElseThrow().isBefore(LocalDateTime.now())
                                    && task.getStatus().orElseThrow() != CLOSED,
                            Collectors.counting()));
            numberOfInProgress = tasks.stream()
                    .map(TaskToParticipant::getTask)
                    .collect(filtering(task -> task.getStatus().orElseThrow() == IN_PROGRESS,
                            Collectors.counting()));
            TasksTrackerStatistic tasksTrackerStatistic = new TasksTrackerStatistic();
            tasksTrackerStatistic.setNumberOfClosed((int) numberOfClosed);
            tasksTrackerStatistic.setNumberOfParticipants((int) numberOfParticipants);
            tasksTrackerStatistic.setNumberOfFailed((int) numberOfFailed);
            tasksTrackerStatistic.setNumberOfInProgress((int) numberOfInProgress);
            return tasksTrackerStatistic;
        }
        return null;
    }

    // возвращает Map,
    // где ключи - идентификаторы исполнителей
    // значения - все его открытые задачи
    public Map<Integer, List<Task>> groupTasksByParticipantId() {
        return tasks.stream()
                .collect(groupingBy(taskToParticipant -> taskToParticipant.getParticipant().getId(),
                        filtering(taskToParticipant -> taskToParticipant.getTask().getStatus().isPresent()
                                        && (taskToParticipant.getTask().getStatus().get() == NEW ||
                                        taskToParticipant.getTask().getStatus().get() == IN_PROGRESS),
                                mapping(TaskToParticipant::getTask, Collectors.toList()))));
    }

    // возвращает Map,
    // где ключи - статус задачи
    // значения - Map,
    //      где ключи - статусы задач,
    //      значения - списки идентификаторов задач
    public Map<Task.Status, Map<Task.Priority, List<Integer>>> groupTasksIdByStatusAndPriority() {
        return tasks.stream()
                .map(TaskToParticipant::getTask)
                .collect(groupingBy(task -> task.getStatus().orElseThrow(),
                        groupingBy(task -> task.getPriority().orElse(null),
                                mapping(Task::getId, toList()))));
    }

    // возвращает неизменяемый список задач, прошедших проверку predicate
    public List<Task> filteredTasks(TaskPredicate predicate) {
        Objects.requireNonNull(predicate);
        return tasks.stream()
                .map(TaskToParticipant::getTask)
                .filter(predicate)
                .toList();
    }
}
