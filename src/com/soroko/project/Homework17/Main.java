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
        getTopTenWords(text);
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
        for (int i = 0; i < words.length; i++) {
            result.put(words[i].length(), new ArrayList<>(Arrays.asList(words[i])));
        }
        return result;
    }

    public static void getTopTenWords(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);
        HashSet<String> wordsSet = new HashSet<>(Arrays.asList(words));
        ArrayList<String> arrayList = new ArrayList<>(wordsSet);
        String[] array = arrayList.toArray(new String[0]);
        for (int i = array.length - 10; i < array.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

}