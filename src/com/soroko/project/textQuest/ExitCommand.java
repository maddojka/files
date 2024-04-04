package com.soroko.project.textQuest;

public class ExitCommand implements Command{
    Exit exit;

    public ExitCommand(Exit exit) {
        this.exit = exit;
    }

    @Override
    public void execute() {
        exit.activate();
    }
}
