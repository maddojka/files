package Homework23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppleStorage implements IStorage<Apple, Long> {
    private String fileName;
    private List<Apple> apples = new ArrayList<>();

    public AppleStorage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Apple> getAll() throws IOException {
        List<String> stringList = Files.readAllLines(Paths.get(fileName));
        for (String string : stringList) {
            String[] str = string.split(";");
            apples.add(
                    new Apple(Long.parseLong(str[0]),
                            str[1],
                            Double.parseDouble(str[2]))
            );
        }
        return apples;
    }

    @Override
    public Apple getById(Long aLong) throws IOException {
        if (apples == null) return null;
        return apples.get(Math.toIntExact(aLong));
    }

    @Override
    public void add(Apple apple) {
        apples.add(apple);
    }

    @Override
    public void remove(Apple apple) {
        apples.remove(apple);
    }
}
