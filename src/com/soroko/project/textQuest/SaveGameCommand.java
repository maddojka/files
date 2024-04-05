package com.soroko.project.textQuest;

public class SaveGameCommand implements Command{
    Menu menu;

    public SaveGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.saveGame();
    }
}
