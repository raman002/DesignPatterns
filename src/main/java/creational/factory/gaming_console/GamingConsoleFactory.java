package creational.factory.gaming_console;

public class GamingConsoleFactory {

    public static Console buildConsole(IGamingConsole.ConsoleType consoleType) {
        return switch(consoleType) {
            case NINTENDO -> new NintendoConsole().buildConsole();
            case XBOX -> new Xbox().buildConsole();
            case PLAYSTATION -> new PlayStation().buildConsole();
        };
    }
}
