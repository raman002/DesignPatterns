package creational.factory.gaming_console;

public interface IGamingConsole {

    Console buildConsole();

    enum ConsoleType {
        NINTENDO, XBOX, PLAYSTATION
    }
}
