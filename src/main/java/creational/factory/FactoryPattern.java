package creational.factory;

import creational.factory.gaming_console.Console;
import creational.factory.gaming_console.GamingConsoleFactory;
import creational.factory.gaming_console.IGamingConsole;
import creational.factory.notification.Notification;
import creational.factory.notification.NotificationFactory;

public class FactoryPattern {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("sms");
        System.out.println(notification.doNotify());


        Console gamingConsole1 = GamingConsoleFactory.buildConsole(IGamingConsole.ConsoleType.NINTENDO);
        Console gamingConsole2 = GamingConsoleFactory.buildConsole(IGamingConsole.ConsoleType.PLAYSTATION);
        Console gamingConsole3 = GamingConsoleFactory.buildConsole(IGamingConsole.ConsoleType.XBOX);

        System.out.println("gamingConsole1 = " + gamingConsole1);
        System.out.println("gamingConsole2 = " + gamingConsole2);
        System.out.println("gamingConsole3 = " + gamingConsole3);
    }
}
