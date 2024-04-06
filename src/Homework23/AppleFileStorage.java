package Homework23;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class AppleFileStorage implements IStorage<Apple, Long> {
    private String fileName;

    public AppleFileStorage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Apple> getAll() throws IOException {

        return Files.lines(Paths.get(fileName))
                .map(string -> {
                    String[] str = string.split(";");
                    return new Apple(Long.parseLong(str[0]),
                            str[1],
                            Double.parseDouble(str[2]));
                }).collect(toCollection(ArrayList::new));
    }

    @Override
    public Apple getById(Long aLong) throws IOException {
       List<Apple> apples = Files.lines(Paths.get(fileName))
               .map(string -> {
                   String[] str = string.split(";");
                   return new Apple(Long.parseLong(str[0]),
                           str[1],
                           Double.parseDouble(str[2]));
               }).collect(toCollection(ArrayList::new));
      return apples.get(Math.toIntExact(aLong));
    }

    @Override
    public void add(Apple apple) throws IOException {
        String appleString = apple.id() + ";" +
                apple.color() + ";" +
                apple.weight() + '\n';
        Files.writeString(Paths.get(fileName), appleString,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    @Override
    public void remove(Apple apple) throws IOException {
        String appleString = apple.id() + ";" +
                apple.color() + ";" +
                apple.weight() + '\n';
        String string = Files.readString(Paths.get("test.txt"));
        string = string.replaceAll(appleString, "");
        new FileWriter(fileName, false).close();
        Files.writeString(Paths.get(fileName), string,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}