package com.soroko.project.Homework13;

public class Animal {
    void doAction(Action action) {
       action.executeNext(this);
    }
}
