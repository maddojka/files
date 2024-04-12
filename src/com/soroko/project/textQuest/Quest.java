package com.soroko.project.textQuest;

/**
 * Quest logic goes here.
 *
 * @version 1.0 14 April 2024
 * @author Yuriy Soroko
 */

import java.util.Scanner;

import static com.soroko.project.textQuest.Constants.*;

public class Quest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Quest states - creation
        QuestStateMachine stateMachine = QuestStateMachine.Introduction;
        //Menu - creation
        Menu menu = new Menu(stateMachine);
        menu.setTitleOfChapter(stateMachine.toString());
        // Gameplay - creation
        MenuInvoker gamePlay = new MenuInvoker(menu);
        // commands creation
        StartGameCommand startGameCommand = new StartGameCommand(START_GAME);
        ReturnGameCommand returnGameCommand = new ReturnGameCommand(RETURN_GAME);
        ExitGameCommand exitGameCommand = new ExitGameCommand(EXIT_GAME);
        SaveGameCommand saveGameCommand = new SaveGameCommand(SAVE_GAME);
        LoadGameCommand loadGameCommand = new LoadGameCommand(LOAD_GAME);
        ReturnMenuCommand returnMenuCommand = new ReturnMenuCommand(RETURN_MENU);
        PrintMenuCommand printMenuCommand = new PrintMenuCommand(PRINT_MENU);
        // set commands
        gamePlay.setCommand(startGameCommand);
        gamePlay.setCommand(returnGameCommand);
        gamePlay.setCommand(exitGameCommand);
        gamePlay.setCommand(saveGameCommand);
        gamePlay.setCommand(loadGameCommand);
        gamePlay.setCommand(returnMenuCommand);
        gamePlay.setCommand(printMenuCommand);

        // quest logic
        while (true) { // menu loop
            gamePlay.menuItemSelected(PRINT_MENU); // printing menu
            switch (scan.nextInt()) { // menu selection
                case 1 -> gamePlay.menuItemSelected(START_GAME); // start game command
                case 2 -> gamePlay.menuItemSelected(RETURN_GAME); // return game command
                case 3 -> gamePlay.menuItemSelected(EXIT_GAME); // exit game command
                case 4 -> gamePlay.menuItemSelected(SAVE_GAME); // save game command
                case 5 -> gamePlay.menuItemSelected(LOAD_GAME); // load game command
                case 6 -> gamePlay.menuItemSelected(RETURN_MENU); // return to main menu command
            }
            if (!menu.getGamePaused() && menu.getGameIsOn()) {
                menu.getQuestStateMachine().textOfParagraph();
                while (menu.getGameIsActive()) { // game loop
                    switch (scan.nextInt()) {
                        case 1 -> { // first branch of logic
                            menu.setQuestStateMachine(menu.getQuestStateMachine().firstState());
                            menu.getQuestStateMachine().textOfParagraph();
                            menu.setTitleOfChapter(menu.getQuestStateMachine().toString());
                        }
                        case 2 -> { // second branch of logic
                            menu.setQuestStateMachine(menu.getQuestStateMachine().secondState());
                            menu.getQuestStateMachine().textOfParagraph();
                            menu.setTitleOfChapter(menu.getQuestStateMachine().toString());
                        }
                        case 3 -> gamePlay.menuItemSelected(RETURN_MENU); // back to main menu command
                    }
                }
            }

        }
    }
}



