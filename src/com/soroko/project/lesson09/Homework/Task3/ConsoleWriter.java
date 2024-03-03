package com.soroko.project.lesson09.Homework.Task3;

public class ConsoleWriter implements AppLogger {
    public ConsoleWriter() {
    }

    @Override
    public String log(String str) {
        System.out.println(str);
        return str;
    }
}
