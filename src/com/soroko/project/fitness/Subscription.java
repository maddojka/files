package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Subscription {

    private int numberOfSubscription;
    private TypeOfSubscription typeOfSubscription;
    private PersonData personData;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfExpiration;

    public Subscription(int numberOfSubscription, PersonData personData, TypeOfSubscription typeOfSubscription, LocalDate dateOfRegistration) {
        if (personData == null)
            throw new IllegalArgumentException("Данные о посетителе не могут быть пустыми");
        setNumberOfSubscription(numberOfSubscription);
        this.typeOfSubscription = typeOfSubscription;
        setTypeOfSubscription(typeOfSubscription);
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
        setTypeOfSubscription(typeOfSubscription);
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

    public void setTypeOfSubscription(TypeOfSubscription typeOfSubscription) {
        if (typeOfSubscription == null)
            throw new IllegalArgumentException("Тип абонемента не может быть пустой строкой");
        this.typeOfSubscription = typeOfSubscription;
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

    public TypeOfSubscription getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public PersonData getPersonData() {
        return personData;
    }

    private void setTimeOfVisit() {
        if (this.typeOfSubscription == TypeOfSubscription.ONE_OFF) {
            this.dateOfExpiration = LocalDate.now();
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
                ", время посещения: " + typeOfSubscription.getStartTimeOfVisit() +
                "-" + typeOfSubscription.getEndTimeOfVisit();
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

