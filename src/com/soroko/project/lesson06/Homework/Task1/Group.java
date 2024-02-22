package com.soroko.project.lesson06.Homework.Task1;

public class Group {
    String groupOpen;
    Climber[] climber;
    Mountain mountain;

    public Group() {
    }

    public Group(String groupOpen, Climber[] climber, Mountain mountain) {
        if ("".equals(groupOpen))
            throw new IllegalArgumentException("Status of the group cannot be empty");
        this.groupOpen = groupOpen;
        this.climber = climber;
        this.mountain = mountain;
    }

    public void addClimber(Climber[] climber) {
        if (getGroupOpen().equals("YES")) {

        } else {
            return;
        }
    }

    public String getGroupOpen() {
        return groupOpen;
    }
}
