package creational.factory.notification;

public class EmailNotification implements Notification {

    @Override
    public String doNotify() {
        return "email";
    }


}
