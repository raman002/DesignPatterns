package creational.factory;

import creational.factory.gaming_console.GamingConsoleFactory;
import creational.factory.gaming_console.IGamingConsole;
import creational.factory.notification.Notification;
import creational.factory.notification.NotificationFactory;

public class FactoryPattern {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("sms");
        System.out.println(notification.doNotify());
        
        
        IGamingConsole console = GamingConsoleFactory.getConsole("XB");
        System.out.println(console.buildConsole());
    }
}
