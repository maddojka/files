package com.soroko.project.Homework13;

public class Play extends Action {
    @Override
    void execute() {
        System.out.println("play");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }
}
