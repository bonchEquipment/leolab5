package org.commands;

public interface Command {
    String execute();

    String getDescription();

    default String getName() {
        return getClass().getSimpleName().toLowerCase();
    }
}
