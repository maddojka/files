package com.soroko.project.textQuest;

public class LoadGameCommand implements Command{
   Menu menu;

    public LoadGameCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.loadGame();
    }
}
