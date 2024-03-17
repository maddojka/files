package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Subscription {

    private int numberOfSubscription;
    TypeOfSubscription typeOfSubscription;
    PersonData personData;
    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfExpiration;
    private int access = 0;

    public Subscription(int numberOfSubscription, PersonData personData, TypeOfSubscription typeOfSubscription, LocalDate dateOfRegistration) {
        if (personData == null)
            throw new IllegalArgumentException("Данные о посетителе не могут быть пустыми");
        setNumberOfSubscription(numberOfSubscription);
        this.typeOfSubscription = typeOfSubscription;
        setTypeOfSubscription(String.valueOf(typeOfSubscription));
        this.numberOfSubscription = numberOfSubscription;
        this.personData = personData;
        setTimeOfVisit();
        this.dateOfRegistration = dateOfRegistration;
    }

    public Subscription(int numberOfSubscription, PersonData personData, TypeOfSubscription typeOfSubscription, LocalDate dateOfRegistration, LocalDate dateOfExpiration) {
        if (personData == null)
            throw new IllegalArgumentException("Данные о посетителе не могут быть пустыми");
        setNumberOfSubscription(numberOfSubscription);
        this.typeOfSubscription = typeOfSubscription;
        setTypeOfSubscription(String.valueOf(typeOfSubscription));
        this.numberOfSubscription = numberOfSubscription;
        this.personData = personData;
        setTimeOfVisit();
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
    }

    public int getNumberOfSubscription() {
        return numberOfSubscription;
    }

    public void setNumberOfSubscription(int numberOfSubscription) {
        if (numberOfSubscription <= 0 && numberOfSubscription != -1)
            throw new IllegalArgumentException("Номер абонемента - целое положительное число");
        this.numberOfSubscription = numberOfSubscription;
    }

    public void setTypeOfSubscription(String typeOfSubscription) {
        if ("".equals(typeOfSubscription))
            throw new IllegalArgumentException("Тип абонемента не может быть пустой строкой");
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


    private void setTimeOfVisit() {
        if (this.typeOfSubscription == TypeOfSubscription.ONE_OFF) {
            this.startTimeOfVisit = TypeOfSubscription.ONE_OFF.getStartTimeOfVisit();
            this.endTimeOfVisit = TypeOfSubscription.ONE_OFF.getEndTimeOfVisit();
            this.dateOfExpiration = LocalDate.now();
            this.access = TypeOfSubscription.ONE_OFF.getAccess();
        } else if (this.typeOfSubscription == TypeOfSubscription.DAY_TIME) {
            this.startTimeOfVisit = TypeOfSubscription.DAY_TIME.getStartTimeOfVisit(); // 8 - 0
            this.endTimeOfVisit = TypeOfSubscription.DAY_TIME.getEndTimeOfVisit();  // 16 - 0
            this.access = TypeOfSubscription.DAY_TIME.getAccess();
        } else if (this.typeOfSubscription == TypeOfSubscription.FULL_TIME) {
            this.startTimeOfVisit = TypeOfSubscription.FULL_TIME.getStartTimeOfVisit(); // 8 - 0
            this.endTimeOfVisit = TypeOfSubscription.FULL_TIME.getEndTimeOfVisit();  // 22 - 0
            this.access = TypeOfSubscription.FULL_TIME.getAccess();
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
                ", Имя: " + personData.getName() +
                ", Фамилия: " + personData.getSurname() +
                ", год: " + personData.getYear() +
                ", время посещения: " + startTimeOfVisit +
                "-" + endTimeOfVisit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subscription)) return false;
        Subscription that = (Subscription) o;
        return getNumberOfSubscription() == that.getNumberOfSubscription() && personData.getYear() == that.personData.getYear()
                && Objects.equals(personData.getName(), that.personData.getName())
                && Objects.equals(personData.getSurname(), that.personData.getSurname());
    }
}

