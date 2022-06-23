package creational.factory.notification;

public class SMSNotification implements Notification {

    @Override
    public String doNotify() {
        return "sms";
    }


}
