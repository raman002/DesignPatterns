package creational.factory.gaming_console;

public class PlayStation implements IGamingConsole {
    @Override
    public Console buildConsole() {
        return new Console("Sony Inc", "PlayStation 5", 2000.50);
    }
}
