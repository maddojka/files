package com.soroko.project.Homework21;

import java.time.LocalDateTime;
import java.util.Optional;

public class Task {
    private int id;
    private String title;
    private Status status;
    private Priority priority;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;


    // геттеры, сеттеры и д.т


    public Task(int id, String title, Status status, Priority priority, LocalDateTime createdAt, LocalDateTime closeTo) {
        setId(id);
        setTitle(title);
        this.id = id;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.closeTo = closeTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 1000)
            throw new IllegalArgumentException("Значение id должно быть больше 1000");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ("".equals(title))
            throw new IllegalArgumentException("Название задачи не может быть пустой строкой");
        this.title = title;
    }

    public Optional<Status> getStatus() {
        return Optional.of(status);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Optional<Priority> getPriority() {
        return Optional.of(priority);
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Optional<LocalDateTime> getCreatedAt() {
        return Optional.of(createdAt);
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Optional<LocalDateTime> getCloseTo() {
        return Optional.of(closeTo);
    }

    public void setCloseTo(LocalDateTime closeTo) {
        this.closeTo = closeTo;
    }

    @Override
    public String toString() {
        return "Task - " +
                "id: " + id +
                ", title: " + title + '\'' +
                ", status: " + status +
                ", createdAt: " + createdAt +
                ", closeTo: " + closeTo;
    }

    public enum Status {
        NEW, IN_PROGRESS, CLOSED
    }

    public enum Priority {
        URGENT, HIGH, MEDIUM, LOW
    }
}