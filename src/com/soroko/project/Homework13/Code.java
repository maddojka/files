package com.soroko.project.Homework13;

public class Code extends Action {
    @Override
    void execute() {
        System.out.println("code");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }
}
