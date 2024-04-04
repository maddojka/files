package com.soroko.project.textQuest;

public class LoadGameCommand implements Command{
    LoadGame loadGame;

    public LoadGameCommand(LoadGame loadGame) {
        this.loadGame = loadGame;
    }

    @Override
    public void execute() {
        loadGame.activate();
    }
}
