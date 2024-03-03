package com.soroko.project.lesson09.Homework.Task3;

public class Delimiter extends ConsoleWriter  implements AppLogger {
    public Delimiter(Upper upper, ConsoleWriter consoleWriter) {
    }

    public Delimiter(AppFileWriter appFileWriter) {
    }

    @Override
    public String log(String str) {
        return str + ";";
    }
}
