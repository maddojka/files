package com.soroko.project.Homework13;

public class Sleep extends Action {
    @Override
    void execute() {
        System.out.println("sleep");
    }

    @Override
    void nextAction() {
        execute();
        new Code().nextAction();
    }
}
