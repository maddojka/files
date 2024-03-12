package com.soroko.project.Homework13;

public class Play extends Action {
    @Override
    void execute() {
        System.out.println("play");
    }

    @Override
    void nextAction() {
        execute();
    }
}
