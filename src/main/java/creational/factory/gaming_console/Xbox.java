package creational.factory.gaming_console;

public class Xbox implements IGamingConsole {

    @Override
    public Console buildConsole() {
        return new Console("Microsoft", "Xbox One", 1500.10);
    }
}
