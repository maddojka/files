package com.soroko.project.Homework21;

import java.time.LocalDateTime;

import static com.soroko.project.Homework21.Task.Priority.*;
import static com.soroko.project.Homework21.Task.Status.*;

public class Main {
    public static void main(String[] args) {
        Participant participant01 = new Participant(1, "Alex", true, 2, 10);
        Participant participant02 = new Participant(2, "Mike", false, 1, 5);
        Participant participant03 = new Participant(2, "John", true, 5, 20);
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
        TaskTracker taskTracker = TaskTracker.withTitle("Трекер задач");
        TaskPredicate taskPredicateOne = task -> task.getStatus().isPresent()
                && task.getPriority().isPresent()
                && (task.getStatus().get() == IN_PROGRESS || task.getStatus().get() == NEW)
                && task.getPriority().get() == URGENT;
        TaskPredicate predicateTwo = task -> task.getStatus().isPresent()
                && task.getPriority().isPresent()
                && (task.getStatus().get() == CLOSED)
                && task.getPriority().get() == HIGH;
        TaskPredicate[] taskPredicates = {taskPredicateOne, predicateTwo};
        ParticipantPredicate participantPredicateOne = participant -> participant.getExperience() > 5;
        ParticipantPredicate participantPredicateTwo = participant -> participant.getMaxTasks() < 10;
        ParticipantPredicate[] participantPredicates = {participantPredicateOne, participantPredicateTwo};
        taskTracker.taskSettings(-1, taskPredicates);
        taskTracker.participantSettings(-1, participantPredicates);
    }
}
