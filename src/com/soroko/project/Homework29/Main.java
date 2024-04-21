package com.soroko.project.Homework29;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static final String FILE_PATH =
            "C:\\Users\\yuriy\\IdeaProjects\\lessons\\src\\com\\soroko\\project\\Homework28\\text.txt";

    public static void main(String[] args) throws InterruptedException {
        String[] words = readText(FILE_PATH);
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        HashMap<String, Integer> topTenWords = countWords(numberOfThreads, words);

        Map<String, Integer> sortedMap = topTenWords.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))    // Map.Entry.comparingByValue()
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
    }

    public static synchronized HashMap<String, Integer> countWords(int numberOfThreads, String[] words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < numberOfThreads; i++) {
            Thread obj = new Thread(() -> {
                for (String str : words) {
                    synchronized (result) {
                        if (str.length() > 3) {
                            if (result.containsKey(str)) {
                                result.put(str, result.get(str) + 1);
                            } else {
                                result.put(str, 1);
                            }
                        }
                    }
                }
            });
            obj.start();
        }
        return result;
    }

    public static String[] readText(String filePath) {
        List<String> reader = new ArrayList<>();
        try {
            reader = Files.readAllLines(Path.of(filePath));
        } catch (Exception exception) {
            System.out.println("Something went wrong: " + exception);
        }
        String str = reader.toString()
                .replaceAll("\\pP", "")
                .trim()
                .toLowerCase();
        return str.split(" ");
    }
}
