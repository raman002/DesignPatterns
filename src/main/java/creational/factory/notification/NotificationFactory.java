package creational.factory.notification;

public abstract class NotificationFactory {

    public static Notification createNotification(String type) {
        return switch (type) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "push" -> new PushNotification();
            default -> throw new RuntimeException("invalid notification type");
        };
    }
}
