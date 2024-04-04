package com.soroko.project.textQuest;

public class ReturnCommand implements Command{
    Return returnToGame;

    public ReturnCommand(Return returnToGame) {
        this.returnToGame = returnToGame;
    }

    @Override
    public void execute() {
        returnToGame.activate();
    }
}
