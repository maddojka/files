package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class Subscription {
    private final String ONE_OFF = "Разовый";
    private final String DAY_TIME = "Дневной";
    private final String FULL_TIME = "Полный";
    private int numberOfSubscription;
    private String typeOfSubscription;
    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfExpiration;
    private String name;
    private String surname;
    private int year;
    private int access = 0;

    public Subscription(int numberOfSubscription, String typeOfSubscription, LocalDate dateOfRegistration, String name, String surname, int year) {
        if (numberOfSubscription <= 0 && numberOfSubscription != -1)
            throw new IllegalArgumentException("Номер абонемента - целое положительное число");
        if ("".equals(typeOfSubscription))
            throw new IllegalArgumentException("Тип абонемента не может быть пустой строкой");
        if ("".equals(name))
            throw new IllegalArgumentException("Имя не может быть пустой строкой");
        if ("".equals(surname))
            throw new IllegalArgumentException("Фамилия не может быть пустой строкой");
        if (year < 1950 || year > 2010)
            throw new IllegalArgumentException("Клиент не проходит по возрасту");
        this.numberOfSubscription = numberOfSubscription;
        this.typeOfSubscription = typeOfSubscription;
        setTimeOfVisit();
        this.dateOfRegistration = dateOfRegistration;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getNumberOfSubscription() {
        return numberOfSubscription;
    }

    public void setNumberOfSubscription(int numberOfSubscription) {
        this.numberOfSubscription = numberOfSubscription;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public LocalTime getStartTimeOfVisit() {
        return startTimeOfVisit;
    }

    public LocalTime getEndTimeOfVisit() {
        return endTimeOfVisit;
    }

    public void setStartTimeOfVisit() {
        this.startTimeOfVisit = startTimeOfVisit;
    }

    public void setEndTimeOfVisit(LocalTime endTimeOfVisit) {
        this.endTimeOfVisit = endTimeOfVisit;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getONE_OFF() {
        return ONE_OFF;
    }

    public String getDAY_TIME() {
        return DAY_TIME;
    }

    public String getFULL_TIME() {
        return FULL_TIME;
    }

    public String getTypeOfSubscription() {
        return typeOfSubscription;
    }

    private void setTimeOfVisit() {
        if (typeOfSubscription.equalsIgnoreCase(ONE_OFF)) {
            this.startTimeOfVisit = LocalTime.of(8, 0);
            this.endTimeOfVisit = LocalTime.of(22, 0);
            this.access = 1;
        } else if (typeOfSubscription.equalsIgnoreCase(DAY_TIME)) {
            this.startTimeOfVisit = LocalTime.of(8, 0);
            this.endTimeOfVisit = LocalTime.of(16, 0);
            this.access = 2;
        } else if (typeOfSubscription.equalsIgnoreCase(FULL_TIME)) {
            this.startTimeOfVisit = LocalTime.of(8, 0);
            this.endTimeOfVisit = LocalTime.of(22, 0);
            this.access = 3;
        } else {
            this.startTimeOfVisit = LocalTime.of(0, 0);
            this.endTimeOfVisit = LocalTime.of(0, 0);
            this.access = 0;
        }
    }

    @Override
    public String toString() {
        return "Абонемент номер: " + numberOfSubscription +
                ", дата регистрации: " + dateOfRegistration +
                ", дата окончания: " + dateOfExpiration +
                ", Имя: " + name +
                ", Фамилия: " + surname +
                ", год: " + year +
                ", время посещения: " + startTimeOfVisit +
                "-" + endTimeOfVisit;
    }
}

