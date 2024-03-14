package com.soroko.project.Homework13;

public class Drink extends Action {
    @Override
    public void execute() {
        System.out.println("drink");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }



}
