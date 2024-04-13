package com.soroko.project.textQuest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.soroko.project.textQuest.Constants.RETURN_MENU;

public class GamePlay {
    private Map<String, Command> menuCommands = new HashMap<>();
    private Menu menu;
    private Scanner scanner;

    public GamePlay(Menu menu) {
        if (menu == null)
            throw new IllegalArgumentException();
        this.menu = menu;
        scanner = new Scanner(System.in);
    }

    public void setCommand(Command command) {
        menuCommands.put(command.getCode(), command);
    }

    public void menuItemSelected(String code) {
        menuCommands.get(code).execute(menu);
    }
    public void startGameLoop() {
        if (!menu.getGamePaused() && menu.getGameIsOn()) {
            menu.getQuestStateMachine().textOfParagraph();
            while (menu.getGameIsActive()) { // game loop
                switch (scanner.nextInt()) {
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
                    case 3 -> menuItemSelected(RETURN_MENU); // back to main menu command
                }
            }
        }
    }
}
