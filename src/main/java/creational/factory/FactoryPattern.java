package creational.factory;

public class FactoryPattern {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");

        System.out.println(notification.doNotify());
    }
}
