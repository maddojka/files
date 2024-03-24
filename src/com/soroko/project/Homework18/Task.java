package com.soroko.project.Homework18;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String title;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;

    public Task(int id, String title, Status status, LocalDateTime createdAt, LocalDateTime closeTo) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
        this.closeTo = closeTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCloseTo() {
        return closeTo;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", closeTo=" + closeTo +
                '}';
    }

    public enum Status {
        NEW, IN_PROGRESS, CLOSED
    }
}
