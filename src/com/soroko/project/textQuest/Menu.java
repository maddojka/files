package com.soroko.project.textQuest;

public class Menu {
    private boolean gameIsOn;
    private boolean gameIsActive;

    public void startGame() {
       gameIsOn = true;
        gameIsActive = true;
    }

    public void returnGame() {
        gameIsActive = true;
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
    }

    public void printMenu() {
        if (!gameIsOn) {
            System.out.println("1. Начать игру");
            System.out.println("2. Вернуться к игре");
            System.out.println("3. Выйти из игры");

        } else if (gameIsOn) {
            System.out.println("1. Начать игру");
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
}
