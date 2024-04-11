package com.soroko.project.Homework24;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> wordToCount = new HashMap<>();
        try {
            String text = readWithBuffer("text.txt");
            String[] words = text.split("\r\n");
            String testWord = "dd8222kdd8";
            int counter = 1;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(testWord)) {
                    wordToCount.put(words[i], counter);
                    counter++;
                }
            }
            for (Map.Entry<String, Integer> stringIntegerEntry : wordToCount.entrySet()) {
                System.out.println(stringIntegerEntry);
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
    }

    public static String readWithBuffer(String filename) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             BufferedInputStream buffered = new BufferedInputStream(fileInputStream, 1024);
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        ) {
            byte[] buf = new byte[65535];
            int data;
            while ((data = buffered.read(buf)) != -1) {
                byteArray.write(buf, 0, data);
            }
            return byteArray.toString();
        }
    }
}
