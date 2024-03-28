package com.soroko.project.Homework20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.soroko.project.Homework20.Article.Category.*;

public class Main {
    public static void main(String[] args) {
        Author[] authors1 = new Author[5];
        authors1[0] = new Author("Ivan", "ivan@gmail.com", LocalDate.of(1993, 2, 9));
        authors1[1] = new Author("Fedor", "fedor@gmail.com", LocalDate.of(1992, 3, 21));
        authors1[2] = new Author("Michael", "michael@gmail.com", LocalDate.of(2004, 4, 20));
        authors1[3] = new Author("Eden", "eden@gmail.com", LocalDate.of(2000, 2, 15));
        authors1[4] = new Author("Alexandr", "alexandr@gmail.com", LocalDate.of(1974, 5, 10));
        Author[] authors2 = new Author[5];
        authors2[0] = new Author("Anna", "anna@gmail.com", LocalDate.of(1985, 6, 11));
        authors2[1] = new Author("Mariya", "mariya@gmail.com", LocalDate.of(1963, 7, 13));
        authors2[2] = new Author("Alexey", "alexey@gmail.com", LocalDate.of(1990, 8, 14));
        authors2[3] = new Author("Nikolay", "nikolay@gmail.com", LocalDate.of(1995, 9, 16));
        authors2[4] = new Author("Andrey", "andrey@gmail.com", LocalDate.of(1998, 2, 1));
        Article article1 = new Article("Food", FOOD, authors1);
        Article article2 = new Article("TravelBlog", TRAVELLING, authors2);
        ArrayList<Article> articles = new ArrayList<>() {{
            add(article1);
            add(article2);
        }};
        System.out.println("Средний возраст авторов статей:");
        System.out.println(Task1920.task01(articles));
        System.out.println("Авторы статей категории FOOD:");
        System.out.println(Task1920.task02(articles, FOOD));
        System.out.println("Статьи с возрастом в заданном диапазоне:");
        System.out.println(Task1920.task03(articles, TRAVELLING, 20,70));
        System.out.println("Статьи опубликованные сегодня:");
        System.out.println(Task1920.task04(articles, TRAVELLING));
    }
}
