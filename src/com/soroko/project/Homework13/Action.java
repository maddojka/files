package com.soroko.project.Homework13;

public abstract class Action {
    abstract void execute();

    void nextAction(Action action) {
        execute();
        if (action instanceof Eat) {
            new Drink().execute();
            new Play().execute();
        }
        else if (action instanceof Drink) {
            new Play().execute();
        }
    }
};

