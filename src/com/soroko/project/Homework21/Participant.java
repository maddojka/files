package com.soroko.project.Homework21;

public class Participant {
    private int id;
    private String name;
    // доступен в данный момент
    private boolean active;
    // опыт
    private int experience;
    // максимальное количество задач, которые может выполнить
    private int maxTasks;

    // геттеры, сеттеры и д.т
    public Participant(int id, String name, boolean active, int experience, int maxTasks) {
        setId(id);
        setName(name);
        setExperience(experience);
        setMaxTasks(maxTasks);
        this.id = id;
        this.name = name;
        this.active = active;
        this.experience = experience;
        this.maxTasks = maxTasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0)
            throw new IllegalArgumentException("Значение id должно быть больше 0");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if("".equals(name))
            throw new IllegalArgumentException("Имя не может быть пустой строкой");
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0)
            throw new IllegalArgumentException("Опыт не может быть отрицательным значением");
        this.experience = experience;
    }

    public int getMaxTasks() {
        return maxTasks;
    }

    public void setMaxTasks(int maxTasks) {
        if (maxTasks <= 0)
            throw new IllegalArgumentException("Максимальное кол-во задач не может быть отрицательным значением");
        this.maxTasks = maxTasks;
    }

    @Override
    public String toString() {
        return "Participant - " +
                "id: " + id +
                ", name: " + name +
                ", active: " + active +
                ", experience: " + experience +
                ", maxTasks: " + maxTasks;
    }
}
