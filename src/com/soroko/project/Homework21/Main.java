package com.soroko.project.Homework21;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static com.soroko.project.Homework21.Task.Priority.*;
import static com.soroko.project.Homework21.Task.Status.*;

public class Main {
    public static void main(String[] args) {
        // Participants creation
        Participant participant01 = new Participant(1, "Alex", true, 2, 10);
        Participant participant02 = new Participant(2, "Mike", false, 1, 5);
        Participant participant03 = new Participant(2, "John", true, 5, 20);
        // Tasks creation
        Task task01 = new Task(1001, "issue01", NEW, LOW,
                LocalDateTime.of(2023, 11, 25, 10, 15),
                LocalDateTime.of(2024, 6, 30, 23, 59));
        Task task02 = new Task(1002, "issue02", IN_PROGRESS, MEDIUM,
                LocalDateTime.of(2023, 10, 10, 9, 45),
                LocalDateTime.of(2024, 7, 31, 23, 59));
        Task task03 = new Task(1003, "issue03", CLOSED, HIGH,
                LocalDateTime.of(2023, 7, 18, 15, 38),
                LocalDateTime.of(2024, 1, 1, 23, 59));
        Task task04 = new Task(1004, "issue04", NEW, URGENT,
                LocalDateTime.of(2024, 4, 1, 9, 56),
                LocalDateTime.of(2024, 4, 1, 23, 59));
        // Tracker creation
        TaskTracker taskTracker = TaskTracker.withTitle("Трекер задач");
        // Predicates creation
        TaskPredicate taskPredicateOne = task -> task.getStatus().isPresent()
                && task.getPriority().isPresent()
                && (task.getStatus().get() == IN_PROGRESS || task.getStatus().get() == NEW)
                && task.getPriority().get() == URGENT;
        TaskPredicate taskPredicateTwo = task -> task.getStatus().isPresent()
                && task.getPriority().isPresent()
                && (task.getStatus().get() == CLOSED)
                && task.getPriority().get() == HIGH;
        Predicate<Task> taskPredicates = taskPredicateOne.or(taskPredicateTwo);
        ParticipantPredicate participantPredicateOne = participant -> participant.getExperience() > 1;
        ParticipantPredicate participantPredicateTwo = participant -> participant.getMaxTasks() < 20;
        Predicate<Participant> participantPredicates = participantPredicateOne.or(participantPredicateTwo);
        // Call methods and finally tests
        // replace predicates by settings methods
        taskTracker.taskSettings(taskPredicates);
        taskTracker.participantSettings(participantPredicates);
        // add new tasks and participants
        taskTracker.add(task01, participant01);
        taskTracker.add(task02, participant02);
        taskTracker.add(task03, participant03);
        taskTracker.add(task04, participant03);
        // invoke get statistic method
        TasksTrackerStatistic tasksTrackerStatistic = taskTracker.getStatistics();
        System.out.println(tasksTrackerStatistic);
        // invoke filteredTasks method
        List<Task> filteredTasks = taskTracker.filteredTasks(task -> task.getStatus().orElseThrow() == CLOSED);
        for (Task filteredTask : filteredTasks) {
            System.out.println(filteredTask);
        }
        // invoke groupTasksIdByStatusAndPriority() method
        Map<Task.Status, Map<Task.Priority, List<Integer>>> groupOfTasks = taskTracker.groupTasksIdByStatusAndPriority();
        for (Map.Entry<Task.Status, Map<Task.Priority, List<Integer>>> statusMapEntry : groupOfTasks.entrySet()) {
            System.out.println(statusMapEntry);
        }
    }
}
