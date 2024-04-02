package com.soroko.project.Homework21;

import java.util.Optional;

public class TaskToParticipant {
    private Participant participant;
    private Task task;
    private int progress;

    // геттеры и сеттеры


    public TaskToParticipant(Participant participant, Task task, int progress) {
        this.participant = participant;
        this.task = task;
        this.progress = progress;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "TaskToParticipant - " +
                "participant: " + participant +
                ", task: " + task +
                ", progress: " + progress;
    }
}
