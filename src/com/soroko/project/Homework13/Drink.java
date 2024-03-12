package com.soroko.project.Homework13;

public class Drink extends Action {
    @Override
    void execute() {
        System.out.println("drink");
    }

    @Override
    void nextAction() {
        execute();
        new Play().nextAction();
    }


}
