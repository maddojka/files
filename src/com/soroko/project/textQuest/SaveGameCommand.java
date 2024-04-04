package com.soroko.project.textQuest;

public class SaveGameCommand implements Command{
    SaveGame saveGame;

    public SaveGameCommand(SaveGame saveGame) {
        this.saveGame = saveGame;
    }

    @Override
    public void execute() {
        saveGame.activate();
    }
}
