package com.soroko.project.lesson09.Homework.Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LoggerTask {
    public static void main(String[] args) {

        String filename = "file.txt";
        String data = "���������";
        try {
            Files.writeString(Path.of(filename), data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));

        // � ��������� ����� �������� ������ ����� � ������� (;) - ����������� Delimiter
        // ����� ��������� ����� �������� � �������� ��������  - ����������� Upper
        // ������ ����� �������� � �������  - ����������� ConsoleWriter
        logger01.log("���������");

        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter(filename)));

        // ����� ��������� ����� �������� � �������� ��������  - ����������� Upper
        // � ��������� ����� �������� ������ ����� � ������� (;) - ����������� Delimiter
        // ������ ����� �������� � ����  - ����������� ConsoleWriter
        logger02.log("���������");

        ConsoleWriter console = new ConsoleWriter();
        console.log(filename); // ������ ����� �������� � �������

        AppFileWriter file = new AppFileWriter("file.txt");
        file.log(filename); // ������ ����� �������� � ����
    }
}
