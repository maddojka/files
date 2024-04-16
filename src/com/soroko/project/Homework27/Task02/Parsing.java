package com.soroko.project.Homework27.Task02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Parsing implements Runnable {
    private String name;
    private File file;
    private Thread t;
    private String filePath;
    private List<Good> goods;


    public Parsing(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
        t = new Thread(this, name);
        file = new File(filePath);
        goods = new ArrayList<>();
    }

    public Thread getT() {
        return t;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void parseFile() {
        try (Scanner scan = new Scanner(file);) {
            while (scan.hasNext()) {
                Good good = new Good();
                String nextLine = scan.nextLine();
                String[] data = nextLine.split("::");
                for (int i = 0; i < data.length; i++) {
                    if (data[i].isEmpty()) continue;
                    switch (i) {
                        case 0 -> good.setId(Integer.parseInt(data[i]));
                        case 1 -> good.setTitle(data[i]);
                        case 2 -> good.setPrice(Double.parseDouble(data[i]));
                        case 3 -> good.setQuantity(Integer.parseInt(data[i]));
                    }
                }
                goods.add(good);

            }
        } catch (IOException e) {
            System.out.println("При чтении файла возникла ошибка");
        }
        System.out.println(goods);
    }

    @Override
    public void run() {
        parseFile();
    }
}
