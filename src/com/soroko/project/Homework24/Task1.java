package com.soroko.project.Homework24;

import java.io.*;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {

        try {
            // File streams creation
            FileInputStream fileInputStream = new FileInputStream("text.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
            // Encription / Decription
            XORDecryption xorDecryption = new XORDecryption(fileInputStream);
            XOREncription xorEncription = new XOREncription(fileOutputStream);
            // bite array for testing
            byte[] bytes = new byte[] {1, 2, 3, 9, 6, 88};
            // encrypt
            xorEncription.encrypt(bytes);
            System.out.println(Arrays.toString(bytes));
            // decrypt
            System.out.println(Arrays.toString(xorDecryption.decrypt()));
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
    }
}
