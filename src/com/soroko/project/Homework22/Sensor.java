package com.soroko.project.Homework22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sensor {

    private String typeOfSensor;
    private double temperature;
    private Reactionable ledIndication;
    private List<Reactionable> reactionables = new ArrayList<>();

    public void addReactionables(Reactionable reactionable) {
        reactionables.add(Objects.requireNonNull(reactionable));
    }

    public void removeReactionables(Reactionable reactionable) {
        reactionables.remove(Objects.requireNonNull(reactionable));
    }

    public void temperatureRequest() {
        double temp = Math.random() * 1000;
        if (temp != this.temperature)
            reactionables.forEach(reactionable -> {
                reactionable.react(temp);
                reactionable.log();
            });
        this.temperature = temp;

    }

    public String getTypeOfSensor() {
        return typeOfSensor;
    }

    public void setTypeOfSensor(String typeOfSensor) {
        this.typeOfSensor = typeOfSensor;
    }


    public double getTemperature() {
        return temperature;
    }

    public Reactionable getLedIndication() {
        return ledIndication;
    }

    public void setLedIndication(Reactionable ledIndication) {
        this.ledIndication = ledIndication;
    }

}
