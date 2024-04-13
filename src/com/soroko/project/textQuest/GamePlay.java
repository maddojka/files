package com.soroko.project.textQuest;

import java.util.HashMap;
import java.util.Map;

public class GamePlay {
    private Map<String, Command> menuCommands = new HashMap<>();
    Menu menu;

    public GamePlay(Menu menu) {
        this.menu = menu;
    }

    public void setCommand(Command command) {
        menuCommands.put(command.getCode(), command);
    }

    public void menuItemSelected(String code) {
        menuCommands.get(code).execute(menu);
    }
}
