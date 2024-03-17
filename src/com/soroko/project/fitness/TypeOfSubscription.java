package com.soroko.project.fitness;

import java.time.LocalTime;

public enum TypeOfSubscription {
    ONE_OFF("�������", LocalTime.of(8, 0), LocalTime.of(22, 0)),
    DAY_TIME("�������", LocalTime.of(8, 0), LocalTime.of(16, 0)),
    FULL_TIME("������", LocalTime.of(8, 0), LocalTime.of(22, 0)),
    DEFAULT("����������", LocalTime.MIN, LocalTime.MIN);

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
