package com.soroko.project.Homework20;


import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;


public class Task1920 {
    public static void main(String[] args) {
        // Написать реализацию методов task01 - task04
        // Перед выполнением посмотрите методы flatMap / flatMapToInt / map / mapToInt / allMatch / anyMatch / noneMatch
        // Некоторые из этих методов могут понадобиться при решении задач
    }

    public static double task01(ArrayList<Article> articles) {
        // Вернуть средний возраст авторов статей
        Optional<ArrayList<Article>> optionalArticles = Optional.ofNullable(articles);
        if (optionalArticles.isPresent())
            return articles.stream().
                    flatMapToDouble(article -> article.getAuthors().values().stream().
                            mapToDouble(author -> Period.between(author.getBirth(), LocalDate.now()).getYears()))
                    .average().orElse(-1);
        return 0;
    }

    public static List<String> task02(ArrayList<Article> articles, Article.Category category) {
        // Вернуть список email авторов статей категории == category
        Optional<ArrayList<Article>> optionalArticles = Optional.ofNullable(articles);
        Optional<Article.Category> optionalCategory = Optional.ofNullable(category);
        if (optionalArticles.isPresent() && optionalCategory.isPresent())
            return articles.stream()
                    .filter(article -> article.getCategory() == category)
                    .flatMap(article -> article.getAuthors().values().stream()
                            .map(author -> author.getEmail())).collect(Collectors.toList());
        return null;
    }

    public static List<Article> task03(ArrayList<Article> articles, Article.Category category, int min, int max) {
        // Вернуть список статей категории == category,
        // возраст авторов которых попадает в диапазон от min до max
        Optional<ArrayList<Article>> optionalArticles = Optional.ofNullable(articles);
        Optional<Article.Category> optionalCategory = Optional.ofNullable(category);
        if (optionalArticles.isPresent() && optionalCategory.isPresent() && min > 18 && max < 90)
            return articles.stream()
                    .filter(article -> article.getCategory() == category)
                    .filter(article -> article.getAuthors().values().stream().allMatch(author ->
                            LocalDate.now().getYear() - author.getBirth().getYear() >= min &&
                                    LocalDate.now().getYear() - author.getBirth().getYear() <= max))
                    .collect(Collectors.toList());
        return null;
    }

    public static List<Article> task04(ArrayList<Article> articles, Article.Category category) {
        // Вернуть список статей категории == category, опубликованных сегодня
        Optional<ArrayList<Article>> optionalArticles = Optional.ofNullable(articles);
        Optional<Article.Category> optionalCategory = Optional.ofNullable(category);
        if (optionalArticles.isPresent() && optionalCategory.isPresent())
            return articles.stream().filter(article -> article.getCategory() == category)
                    .filter(article -> article.getPublished().getDayOfYear() == LocalDate.now().getDayOfYear())
                    .collect(Collectors.toList());
        return null;
    }
}