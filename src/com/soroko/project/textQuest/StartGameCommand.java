package com.soroko.project.textQuest;

public class StartGameCommand implements Command{
    StartGame startGame;

    public StartGameCommand(StartGame startGame) {
        this.startGame = startGame;
    }

    @Override
    public void execute() {
        startGame.activate();
    }
}
