package com.soroko.project.textQuest;

public class StartGameCommand implements Command{
    Menu menu;

    public StartGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.startGame();
    }
}
