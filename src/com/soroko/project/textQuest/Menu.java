package com.soroko.project.textQuest;

public class Menu {
    private boolean gameIsOn;
    private boolean gameIsActive;
    private boolean gamePaused;

    public void startGame() {
        gameIsOn = true;
        gameIsActive = true;
    }

    public void returnGame() {
        gameIsActive = true;
        gamePaused = false;
    }

    public void exitGame() {
        System.exit(0);
    }

    public void saveGame() {
    }

    public void loadGame() {
    }

    public void returnMenu() {
        gameIsActive = false;
        gamePaused = true;
    }

    public void printMenu() {
        if (!gameIsOn) {
            System.out.println("1. Начать игру");
            System.out.println("3. Выйти из игры");

        } else if (gameIsOn) {
            System.out.println("2. Вернуться к игре");
            System.out.println("3. Выйти из игры");
            System.out.println("4. Сохранить игру");
            System.out.println("5. Загрузить игру");
        }
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
}
