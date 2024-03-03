package com.soroko.project.lesson09.Homework.Task3;

import java.io.File;
import java.io.IOException;

public class AppFileWriter implements AppLogger {
    public AppFileWriter(String s) {
    }

    @Override
    public String log(String str) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        return str;
    }

}

