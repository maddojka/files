package com.soroko.project.textQuest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Menu {
    private boolean gameIsOn;
    private boolean gameIsActive;
    private boolean gamePaused;
    private boolean gameSaved;
    private boolean gameLoaded;
    private String titleOfChapter;
    QuestStateMachine questStateMachine;

    public Menu(QuestStateMachine questStateMachine) {
        this.questStateMachine = questStateMachine;
    }

    public boolean getGameIsOn() {
        return gameIsOn;
    }

    public boolean getGameIsActive() {
        return gameIsActive;
    }

    public boolean getGamePaused() {
        return gamePaused;
    }

    public boolean getGameSaved() {
        return gameSaved;
    }

    public boolean getGameLoaded() {
        return gameLoaded;
    }

    public void setGameLoaded(boolean gameLoaded) {
        this.gameLoaded = gameLoaded;
    }

    public String getTitleOfChapter() {
        return titleOfChapter;
    }

    public void setTitleOfChapter(String titleOfChapter) {
        this.titleOfChapter = titleOfChapter;
    }

    public void startGame() {
        this.gameIsOn = true;
        this.gameIsActive = true;
    }

    public void returnGame() {
        this.gameIsActive = true;
        this.gamePaused = false;
    }

    public void exitGame() {
        System.exit(0);
    }

    public void saveGame() {
        gameSaved = true;
        try (PrintWriter out = new PrintWriter("quest.txt")) {
            out.print(this.titleOfChapter);
        } catch (IOException ex) {
            System.out.println("Ошибка при попытке чтения в файл");
        }
    }

    public void loadGame() {
        try {
            this.titleOfChapter = new String(Files.readAllBytes(Paths.get("quest.txt")));
        } catch (IOException | NullPointerException ex) {
            System.out.println("Ошибка при попытке чтения из файла");
        }

        switch (this.titleOfChapter) {
            case "Introduction" -> this.questStateMachine = QuestStateMachine.Introduction;
            case "HappyEnd" -> this.questStateMachine = QuestStateMachine.HappyEnd;
            case "TryToSearch" -> this.questStateMachine = QuestStateMachine.TryToSearch;
            case "TryToAskLocals" -> this.questStateMachine = QuestStateMachine.TryToAskLocals;
            case "UnhappyEndSearch" -> this.questStateMachine = QuestStateMachine.UnhappyEndSearch;
            case "TryToAskTheOwl" -> this.questStateMachine = QuestStateMachine.TryToAskTheOwl;
            case "TryToAskTheWolf" -> this.questStateMachine = QuestStateMachine.TryToAskTheWolf;
            case "TrustTheOwl" -> this.questStateMachine = QuestStateMachine.TrustTheOwl;
            case "FindTheHoney" -> this.questStateMachine = QuestStateMachine.FindTheHoney;
            case "UnhappyEndSteal" -> this.questStateMachine = QuestStateMachine.UnhappyEndSteal;
            case "WaitForTheBees" -> this.questStateMachine = QuestStateMachine.WaitForTheBees;
            case "UnhappyEndRest" -> this.questStateMachine = QuestStateMachine.UnhappyEndRest;
            case "BringTheHoneyToTheBear" -> this.questStateMachine = QuestStateMachine.BringTheHoneyToTheBear;
            default -> throw new IllegalArgumentException("Неверное наименование главы");
        }
    }

    public void returnMenu() {
        gameIsActive = false;
        gamePaused = true;
    }

    public void printMenu() {
        if (!gameIsOn) {
            System.out.println("1. Начать игру");
            System.out.println("3. Выйти из игры");

        } else if (gameSaved) {
            System.out.println("2. Вернуться к игре");
            System.out.println("3. Выйти из игры");
            System.out.println("4. Сохранить игру");
            System.out.println("5. Загрузить игру");
        } else if (gameIsOn) {
            System.out.println("2. Вернуться к игре");
            System.out.println("3. Выйти из игры");
            System.out.println("4. Сохранить игру");
        }
    }

    public QuestStateMachine getQuestStateMachine() {
        return questStateMachine;
    }

    public void setQuestStateMachine(QuestStateMachine questStateMachine) {
        this.questStateMachine = questStateMachine;
    }
}
