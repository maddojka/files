package com.soroko.project.Homework13;

public class Play extends Action {
    @Override
    public void execute() {
        System.out.println("play");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }
}
