package com.soroko.project.textQuest;

public class ReturnCommand implements Command {
    Menu menu;

    public ReturnCommand(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.returnGame();
    }
}
