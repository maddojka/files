package com.soroko.project.Homework27.Task01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileParsing implements Runnable {
    private String name;
    private File file;
    private Thread t;
    private String filePath;


    public FileParsing(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
        t = new Thread(this, name);
        file = new File(filePath);
    }

    public Thread getT() {
        return t;
    }

    public void parseFile() {
        int counter = 0;
        boolean dataExists = false;
        System.out.println("Результат чтения файла: " +  this.filePath);
        System.out.println("События с приоритетом 7 и выше:");
        try (Scanner scan = new Scanner(file);) {
            while (scan.hasNext()) {
                String nextLine = scan.nextLine();
                String[] data = nextLine.split("::");
                for (int i = 1; i < data.length; i += 2) {
                    int priority = Integer.parseInt(data[i]);
                    if (priority >= 7) {
                        System.out.println("Дата и время: " + data[0] + ", приоритет "
                                + priority + ", событие: " + data[2]);
                        counter++;
                        dataExists = true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("При чтении файла возникла ошибка");
        }
        if (!dataExists) {
            System.out.println("По данному критерию событий не найдено");
        }
        System.out.println("Количество событий с приоритетом 7 и выше: " + (counter));
    }

    @Override
    public void run() {
        parseFile();
    }
}
