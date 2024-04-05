package com.soroko.project.textQuest;

public class ExitCommand implements Command{
    Menu menu;

    public ExitCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.exitGame();
    }
}
