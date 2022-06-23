package creational.factory.notification;

public class PushNotification implements Notification {

    @Override
    public String doNotify() {
        return "push";
    }
}
