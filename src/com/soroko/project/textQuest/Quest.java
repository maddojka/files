package com.soroko.project.textQuest;

import java.util.Scanner;

import static com.soroko.project.textQuest.Constants.*;

public class Quest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        GamePlay gamePlay = new GamePlay(menu);
        StartGameCommand startGameCommand = new StartGameCommand(START_GAME);
        ReturnGameCommand returnGameCommand = new ReturnGameCommand(RETURN_GAME);
        ExitGameCommand exitGameCommand = new ExitGameCommand(EXIT_GAME);
        SaveGameCommand saveGameCommand = new SaveGameCommand(SAVE_GAME);
        LoadGameCommand loadGameCommand = new LoadGameCommand(LOAD_GAME);
        ReturnMenuCommand returnMenuCommand = new ReturnMenuCommand(RETURN_MENU);
        gamePlay.setCommand(startGameCommand);
        gamePlay.setCommand(returnGameCommand);
        gamePlay.setCommand(exitGameCommand);
        gamePlay.setCommand(saveGameCommand);
        gamePlay.setCommand(loadGameCommand);
        gamePlay.setCommand(returnMenuCommand);
        while (true) {
            menu.printMenu();
            int menuSelector = scan.nextInt();
            switch (menuSelector) {
                case 1 -> gamePlay.menuItemSelected(START_GAME);
                case 2 -> gamePlay.menuItemSelected(RETURN_GAME);
                case 3 -> gamePlay.menuItemSelected(EXIT_GAME);
                case 4 -> gamePlay.menuItemSelected(SAVE_GAME);
                case 5 -> gamePlay.menuItemSelected(LOAD_GAME);
                case 6 -> gamePlay.menuItemSelected(RETURN_MENU);
            }
            if (menu.getGameIsOn()) {
                QuestStateMachine stateMachine = QuestStateMachine.Introduction;
                stateMachine.textOfParagraph();
                while (menu.getGameIsActive()) {
                    int gameSelector = scan.nextInt();
                    if (gameSelector == 1) {
                        stateMachine = stateMachine.firstState();
                        stateMachine.textOfParagraph();
                    } else if (gameSelector == 2) {
                        stateMachine = stateMachine.secondState();
                        stateMachine.textOfParagraph();
                    } else if (gameSelector == 3) {
                        gamePlay.menuItemSelected(RETURN_MENU);
                    }
                }
            }
        }
    }
}


