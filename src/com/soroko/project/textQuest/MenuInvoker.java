package com.soroko.project.textQuest;

import java.util.HashMap;
import java.util.Map;

public class MenuInvoker {
    private Map<String, Command> menuCommands = new HashMap<>();
    Menu menu;

    public MenuInvoker(Menu menu) {
        this.menu = menu;
    }

    public void setCommand(Command command) {
        menuCommands.put(command.getCode(), command);
    }

    public void menuItemSelected(String code) {
        menuCommands.get(code).execute(menu);
    }
}
