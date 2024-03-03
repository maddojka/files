package com.soroko.project.lesson09.Homework.Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LoggerTask {
    public static void main(String[] args) {

        String filename = "file.txt";
        String data = "This file has no data";
        try {
            Files.writeString(Path.of(filename), data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));

        // к сообщению будет добавлен символ точки с запятой (;) - возможности Delimiter
        // текст сообщения будет приведен к верзнему регистру  - возможности Upper
        // данные будут выведены в консоль  - возможности ConsoleWriter
        logger01.log(data);

        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter(filename)));

        // текст сообщения будет приведен к верзнему регистру  - возможности Upper
        // к сообщению будет добавлен символ точки с запятой (;) - возможности Delimiter
        // данные будут записаны в файл  - возможности ConsoleWriter
        logger02.log(data);

        ConsoleWriter console = new ConsoleWriter();
        console.log(filename); // данные будут выведены в консоль

        AppFileWriter file = new AppFileWriter(filename);
        file.log(filename); // данные будут записаны в файл
    }
}
