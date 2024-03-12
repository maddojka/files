package com.soroko.project.Homework13;

public class Eat extends Action {

    @Override
    void execute() {
        System.out.println("eat");
    }

    @Override
    void nextAction() {
        execute();
        new Drink().nextAction();
    }
}
