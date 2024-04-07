package com.soroko.project.textQuest;

import java.util.Scanner;

import static com.soroko.project.textQuest.TextQuest.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        GamePlay gamePlay = new GamePlay(menu);
        StartGameCommand startGameCommand = new StartGameCommand(START_GAME);
        ReturnGameCommand returnGameCommand = new ReturnGameCommand(RETURN_GAME);
        ExitGameCommand exitGameCommand = new ExitGameCommand(EXIT_GAME);
        SaveGameCommand saveGameCommand = new SaveGameCommand(SAVE_GAME);
        LoadGameCommand loadGameCommand = new LoadGameCommand(LOAD_GAME);
        gamePlay.setCommand(startGameCommand);
        gamePlay.setCommand(returnGameCommand);
        gamePlay.setCommand(exitGameCommand);
        gamePlay.setCommand(saveGameCommand);
        gamePlay.setCommand(loadGameCommand);
        gamePlay.menuItemSelected(START_GAME);
        gamePlay.menuItemSelected(RETURN_GAME);
        //   gamePlay.menuItemSelected(EXIT_GAME);
        gamePlay.menuItemSelected(SAVE_GAME);
        gamePlay.menuItemSelected(LOAD_GAME);

        TextQuest textQuest = new TextQuest();
        boolean gameIsOn = true;
        int questStatus = 0;
        while (gameIsOn) {
            int selector = scan.nextInt();
            if (selector == 1) {
                questStatus++;
            }
        }
        if (questStatus > 13) {
            gameIsOn = false;
            questStatus = 0;
        }
        Paragraph state = Paragraph.FirstParagraph;
        String str = state.textOfParagraph();
        System.out.println(str);
        state = state.firstState();
        System.out.println(state.textOfParagraph());


    }
}
