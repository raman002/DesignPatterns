package creational.factory;

public class PushNotification implements Notification {

    @Override
    public String doNotify() {
        return "push";
    }
}
