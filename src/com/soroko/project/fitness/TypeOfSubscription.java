package com.soroko.project.fitness;

import java.time.LocalTime;

public enum TypeOfSubscription {
    ONE_OFF("Разовый", LocalTime.of(8, 0), LocalTime.of(22, 00)),
    DAY_TIME("Дневной", LocalTime.of(8, 0), LocalTime.of(16, 00)),
    FULL_TIME("Полный", LocalTime.of(8, 0), LocalTime.of(22, 00)),
    DEFAULT("Неизвестно", LocalTime.MIN, LocalTime.MIN);

    private String typeOfSubscription;
    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;

    TypeOfSubscription(String typeOfSubscription, LocalTime startTimeOfVisit, LocalTime endTimeOfVisit) {
        this.typeOfSubscription = typeOfSubscription;
        this.startTimeOfVisit = startTimeOfVisit;
        this.endTimeOfVisit = endTimeOfVisit;
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

}
