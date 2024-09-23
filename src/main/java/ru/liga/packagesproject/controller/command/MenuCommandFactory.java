package ru.liga.packagesproject.controller.command;

public class MenuCommandFactory {


    public MenuCommand getMenuCommand(String input) {
        return switch (input) {
            case "1" -> new LoadTrucksCommand();
            case "2" -> new CountPackagesCommand();
            case "0" -> new ExitCommand();
            default -> new InvalidCommand();
        };
    }
}

