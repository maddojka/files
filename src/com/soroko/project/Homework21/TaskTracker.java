package com.soroko.project.Homework21;


import java.util.*;
import java.util.stream.Collectors;

import static com.soroko.project.Homework21.Task.Status.*;
import static java.util.stream.Collectors.*;

public class TaskTracker {
    private String name;
    private Set<TaskToParticipant> tasks;

    // taskPredicates - условия добавления задач. Тип данных определить самостоятельно +
    // условие добавление задачи по умолчанию: задача должна быть открытой +
    // может быть заменено методом taskSettings +
    private TaskPredicate taskPredicates = task -> task.getStatus().isPresent()
            && (task.getStatus().get() == IN_PROGRESS
            || task.getStatus().get() == NEW);
    private final TaskPredicate initialTaskPredicate = taskPredicates;
    // participantPredicates - условия добавления исполнителей. Тип данных определить самостоятельно +
    // условие добавление исполнителя по умолчанию: исполнитель должен быть +
    // доступен по свойству active +
    // может быть заменено методом participantSettings +
    private ParticipantPredicate participantPredicates = participant -> participant.isActive();

    private ParticipantPredicate initialParticipantPredicates = participantPredicates;

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
    public TaskTracker taskSettings(int index, TaskPredicate... predicates) {

        // predicates - массив типа TaskPredicate -
        // условия добавления задач, +
        // например, predicates - задача должна быть срочной +
        //                      - задача должна быть новой +
        //                      - задача должна быть просроченной +
        // все условия хранятся в TaskPredicate +
        Objects.requireNonNull(predicates);
        if (index > predicates.length) index = predicates.length - 1;
        if (index < 0) this.taskPredicates = initialTaskPredicate;
        else
            this.taskPredicates = predicates[index];
        return this;
    }


    // ParticipantPredicate - функциональный интерфейс +
    // его абстрактный метод принимает задачу, возвращает ture или false +
    public TaskTracker participantSettings(int index, ParticipantPredicate... predicates) {
        // predicates - массив типа ParticipantPredicate - +
        // условия добавления исполнителей
        // например, predicates - опыт работы выше 5
        //                      - исполнитель должен быть доступен
        //                      - у исполнителя еще нет задач
        // все условия хранятся в participantPredicates +
        Objects.requireNonNull(predicates);
        if (index > predicates.length) index = predicates.length - 1;
        if (index < 0) this.participantPredicates = initialParticipantPredicates;
        else
            this.participantPredicates = predicates[index];
        return this;
    }

    public TaskTracker add(Task task, Participant participant) {
        Objects.requireNonNull(task);
        Objects.requireNonNull(participant);
        // создается TaskToParticipant, если задача (task) и исполнитель (participant)
        // удовлетворяют требованиям taskPredicates и participantPredicates
        // TaskToParticipant добавляется в tasks +
        if (taskPredicates.applyTask(task) && participantPredicates.applyParticipant(participant)) {
            tasks.add(new TaskToParticipant());
        }
        return this;
    }

    // возвращает статистику по текущему состоянию трекера
    public TasksTrackerStatistic getStatistics() {
        // реализовать метод, используя collectors api
        // посмотрите методы teeing() и reducing()
        TasksTrackerStatistic tasksTrackerStatistic = tasks.stream().collect(Collectors.teeing(
                Collectors.mapping()
        ));
        return tasksTrackerStatistic;
    }

    // возвращает Map,
    // где ключи - идентификаторы исполнителей
    // значения - все его открытые задачи
    public Map<Integer, List<Task>> groupTasksByParticipantId() {
        return tasks.stream()
                .collect(Collectors.groupingBy(taskToParticipant -> taskToParticipant.getParticipant().getId(),
                        Collectors.filtering(taskToParticipant -> taskToParticipant.getTask().getStatus().isPresent()
                                        && (taskToParticipant.getTask().getStatus().get() == NEW ||
                                        taskToParticipant.getTask().getStatus().get() == IN_PROGRESS),
                                Collectors.mapping(TaskToParticipant::getTask, Collectors.toList()))));
    }

    // возвращает Map,
    // где ключи - статус задачи
    // значения - Map,
    //      где ключи - статусы задач,
    //      значения - списки идентификаторов задач

    public Map<Task.Status, Map<Task.Priority, List<Integer>>> groupTasksIdByStatusAndPriority() {
        return tasks.stream()
                .collect(Collectors.groupingBy(Collectors.groupingBy(taskToParticipant -> taskToParticipant.getTask().getPriority().orElse(null),
                        Collectors.mapping(taskToParticipant -> taskToParticipant.getTask().getId()))));
    }
    /*Map<String, Map<BlogPostType, List>> map = posts.stream()
            .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));*/

    // возвращает неизменяемый список задач, прошедших проверку predicate
    public List<Task> filteredTasks(TaskPredicate predicate) {
        Objects.requireNonNull(predicate);
        return tasks.stream()
                .map(TaskToParticipant::getTask)
                .filter(task -> taskPredicates.applyTask(task))
                .toList();
    }
}
