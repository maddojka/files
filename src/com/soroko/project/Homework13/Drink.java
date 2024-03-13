package com.soroko.project.Homework13;

public class Drink extends Action {
    @Override
    void execute() {
        System.out.println("drink");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }


}
