package org.example;

import org.commands.Command;
import org.commands.Help;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static String executeCommand(ArrayList<Command> commands, String[] tokens) {
        for (Command command : commands) {
            if (command.getName().equals(tokens[0])) {
                return command.execute();
            }
        }
        return "Unknown command '" + tokens[0] + "'\n";
    }

    public static void main(String[] args) {

        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new Help(commands));

        System.out.println("Hello There! Type 'help' to list available commands");
        while (true) {
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            String[] tokens = cmd.split(" ");
            String result = executeCommand(commands, tokens);
            System.out.print(result);
        }
    }
}
