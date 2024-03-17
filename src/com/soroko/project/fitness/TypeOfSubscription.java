package com.soroko.project.fitness;

import java.time.LocalDate;
import java.time.LocalTime;


public enum TypeOfSubscription {
    ONE_OFF("Разовый", LocalTime.of(8, 0), LocalTime.of(22, 0), 1),
    DAY_TIME("Дневной", LocalTime.of(8, 0), LocalTime.of(16, 0), 2),
    FULL_TIME("Полный", LocalTime.of(8, 0), LocalTime.of(22, 0), 3),
    DEFAULT("Неизвестно", LocalTime.MIN, LocalTime.MIN, 0);

    private String typeOfSubscription;
    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;
    private int access;

    TypeOfSubscription(String typeOfSubscription, LocalTime startTimeOfVisit, LocalTime endTimeOfVisit, int access) {
        this.typeOfSubscription = typeOfSubscription;
        this.startTimeOfVisit = startTimeOfVisit;
        this.endTimeOfVisit = endTimeOfVisit;
        this.access = access;
    }

    public String getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public LocalTime getStartTimeOfVisit() {
        return startTimeOfVisit;
    }

    public LocalTime getEndTimeOfVisit() {
        return endTimeOfVisit;
    }

    public int getAccess() {
        return access;
    }
}
