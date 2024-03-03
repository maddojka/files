package com.soroko.project.lesson09.Homework.Task3;

public class Upper extends AppFileWriter implements AppLogger {

    public Upper(ConsoleWriter s) {
        super(String.valueOf(s));
    }

    @Override
    public String log(String str) {
        return str.toUpperCase();
    }
}
