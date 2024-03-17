package com.soroko.project.fitness;

public class PersonData {
    private String name;
    private String surname;
    private int year;

    public PersonData(String name, String surname, int year) {
        setName(name);
        setSurname(surname);
        setYear(year);
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ("".equals(name))
            throw new IllegalArgumentException("Имя не может быть пустой строкой");
        this.name = name;
    }

    public void setSurname(String surname) {
        if ("".equals(surname))
            throw new IllegalArgumentException("Фамилия не может быть пустой строкой");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1950 || year > 2010)
            throw new IllegalArgumentException("Клиент не проходит по возрасту");
        this.year = year;
    }
}
