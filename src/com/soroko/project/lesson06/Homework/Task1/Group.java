package com.soroko.project.lesson06.Homework.Task1;

public class Group {
    private String groupOpen;
    private Climber[] climber;
    private Mountain mountain;

    public Group() {
    }

    public Group(String groupOpen, Climber[] climber, Mountain mountain) {
        if ("".equals(groupOpen))
            throw new IllegalArgumentException("Status of the group cannot be empty");
        this.groupOpen = groupOpen;
        this.climber = climber;
        this.mountain = mountain;
    }

    public void addClimber(Climber climber) {
        if (getGroupOpen().equals("YES")) {
            for (int i = 0; i < getClimber().length; i++) {
                if (getClimber()[i] == null) {
                    getClimber()[i] = climber;
                    break;
                }
            }
        }
    }

    public String getGroupOpen() {
        return groupOpen;
    }

    public Climber[] getClimber() {
        return climber;
    }
}
