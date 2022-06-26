package creational.factory.gaming_console;

public class NintendoConsole implements IGamingConsole {
    @Override
    public Console buildConsole() {
        return new Console("Nintendo", "HB3S", 29348.3);
    }

    public static void main(String[] args) {
        Console gamingConsole = new NintendoConsole().buildConsole();
    }
}
