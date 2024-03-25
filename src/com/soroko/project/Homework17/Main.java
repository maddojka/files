package com.soroko.project.Homework17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("one");
        strings.add("one");
        strings.add("two");
        strings.add("two");
        strings.add("three");

        Map<String, Long> result01 = getEqualsStrings(strings);
        for (Map.Entry<String, Long> stringLongEntry : result01.entrySet()) {
            System.out.println(stringLongEntry.getKey());
            System.out.println(stringLongEntry.getValue());
        }
        System.out.println(result01);

        Map<String, Long> result02 = getFrequencyOfWord("of", text);
        for (Map.Entry<String, Long> stringLongEntry : result02.entrySet()) {
            System.out.println(stringLongEntry.getKey());
            System.out.println(stringLongEntry.getValue());
        }
        System.out.println(result02);

        Map<Integer, List<String>> result03 = getAmountOfLetters(text);
        for (Map.Entry<Integer, List<String>> string : result03.entrySet()) {
            System.out.println(string.getKey());
            System.out.println(string.getValue());
        }
        System.out.println(result03);
        System.out.println("Топ 10 часто встречаемых слов в тексте: ");



        Car car = new Car(Repaintable.Color.GOLD, "К765СЕ198");
        car.incLevelOfWare(50);
        Bus bus = new Bus("М333РП78");
        bus.incLevelOfWare(20);
        MiniCar miniCar = new MiniCar(Repaintable.Color.ORANGE, "М432ЕН198");
        bus.incLevelOfWare(40);
        Map<String, Vehicle> test = new HashMap<>();
        test.put(car.getNumber(), car);
        test.put(bus.getNumber(), bus);
        test.put(miniCar.getNumber(), miniCar);
        System.out.println("Поврежденные транспортные средсвта:");
        List<Vehicle> result = checkLevelOfWare(test, 30);
        for (Vehicle vehicle : result) {
            System.out.println(vehicle);
        }
        System.out.println("Транспортные средства с требуемым цветом:");
        List<Repaintable> repaintables = new ArrayList<>() {{
            add(car);
            add(miniCar);
        }};
        Map<Repaintable.Color, List<Repaintable>> coloredVehicles = new HashMap<>();
        coloredVehicles.put(Repaintable.Color.GOLD, new ArrayList<>());
        checkColorOfVehicles(repaintables, coloredVehicles);
        System.out.println(coloredVehicles);

        Train train = new Train("45B", 8, true);
        train.breakDown();
        List<Vehicle> repairables = new ArrayList<>() {{
            add(bus);
            add(train);
        }};

        Map<String, Vehicle> repairedVehicles = repairAllVehicles(repairables);
        System.out.println("Отремантированные транспортные средства:");
        System.out.println(repairedVehicles);

    }


    public static Map<String, Long> getEqualsStrings(Collection<String> strings) {
        if (strings.isEmpty()) return null;
        Map<String, Long> result = new HashMap<>();
        for (String string : strings) {
            if (string != null) {
                long count = Collections.frequency(strings, string);
                result.put(string, count);
            }
        }
        return result;
    }

    public static Map<String, Long> getFrequencyOfWord(String word, String text) {
        if (word == null || text == null) return null;
        Map<String, Long> result = new HashMap<>();
        String[] words = text.split(" ");
        List<String> list = Arrays.asList(words);
        long count = Collections.frequency(list, word);
        result.put(word, count);
        return result;
    }

    public static Map<Integer, List<String>> getAmountOfLetters(String text) {
        if (text == null) return null;
        Map<Integer, List<String>> result = new HashMap<>();
        String[] words = text.split(" ");
        for (String string : words) {
            if (string.equalsIgnoreCase(text)) {
                if (result.containsKey(string.length()))
                    result.get(string.length()).add(string);
                else
                    result.put(string.length(), new ArrayList<>());
            }
        }
        return result;
    }

    public static void getTopTenWords(String text) {
        if (text == null) return;
        text = text.toLowerCase().trim();
        String[] words = text.split(" ");
        List<String> list = Arrays.asList(words);
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String string : words) {
            if (string.length() > 2) {
                int count = Collections.frequency(list, string);
                if (map.get(count) == null)
                    map.put(count, new ArrayList<>());
                else map.get(count).add(string);
            }
        }
    }


    public static List<Vehicle> checkLevelOfWare(Map<String, Vehicle> map, int levelOfWare) {
        if (map == null || levelOfWare <= 0) return null;
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle value : map.values()) {
            if (value == null) return null;
            if (value.getLevelOfWare() > levelOfWare) result.add(value);
        }
        return result;
    }

    public static void checkColorOfVehicles(List<Repaintable> list, Map<Repaintable.Color, List<Repaintable>> map) {
        if (list == null || map == null) return;
        for (Map.Entry<Repaintable.Color, List<Repaintable>> entry : map.entrySet()) {
            for (Repaintable repaintable : list) {
                if (repaintable == null) return;
                if (repaintable.getColor() != null && repaintable.getColor().equals(entry.getKey())) {
                    entry.getValue().add(repaintable);
                }
            }
        }
    }

    public static Map<String, Vehicle> repairAllVehicles(List<Vehicle> list) {
        if (list == null) return null;
        Map<String, Vehicle> result = new HashMap<>();
        for (Vehicle vehicle : list) {
            if (vehicle == null) return null;
            vehicle.repair();
            result.put(vehicle.getNumber(), vehicle);
        }
        return result;
    }
}