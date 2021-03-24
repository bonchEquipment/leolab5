package org.commands;

import java.util.List;

public class Help implements Command {
    private List<Command> commandList;

    public Help(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public String execute() {
        StringBuilder res = new StringBuilder();
        for (Command command : this.commandList) {
            res.append(command.getName());
            res.append(" - ");
            res.append(command.getDescription());
            res.append("\n");
        }
        return res.toString();
    }

    @Override
    public String getDescription() {
        return "list and describe available commands";
    }
}
