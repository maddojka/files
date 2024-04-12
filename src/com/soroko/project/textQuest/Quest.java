package com.soroko.project.textQuest;

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
        GamePlay gamePlay = new GamePlay(menu);
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
        while (true) {
            gamePlay.menuItemSelected(PRINT_MENU);
            System.out.println(menu.getTitleOfChapter());
            switch (scan.nextInt()) {
                case 1 -> gamePlay.menuItemSelected(START_GAME);
                case 2 -> gamePlay.menuItemSelected(RETURN_GAME);
                case 3 -> gamePlay.menuItemSelected(EXIT_GAME);
                case 4 -> gamePlay.menuItemSelected(SAVE_GAME);
                case 5 -> gamePlay.menuItemSelected(LOAD_GAME);
                case 6 -> gamePlay.menuItemSelected(RETURN_MENU);
            }
            if (!menu.getGamePaused() && menu.getGameIsOn()) {
                menu.getQuestStateMachine().textOfParagraph();
                while (menu.getGameIsActive()) {
                    int gameSelector = scan.nextInt();
                    if (gameSelector == 1) {
                        menu.setQuestStateMachine(menu.getQuestStateMachine().firstState());
                        menu.getQuestStateMachine().textOfParagraph();
                        menu.setTitleOfChapter(menu.getQuestStateMachine().toString());
                    } else if (gameSelector == 2) {
                        menu.setQuestStateMachine(menu.getQuestStateMachine().secondState());
                        menu.getQuestStateMachine().textOfParagraph();
                        menu.setTitleOfChapter(menu.getQuestStateMachine().toString());
                    } else if (gameSelector == 3) {
                        gamePlay.menuItemSelected(RETURN_MENU);
                    }
                }
            }
        }
    }
}


