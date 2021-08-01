package creational.factory;

public class SMSNotification implements Notification {

    @Override
    public String doNotify() {
        return "sms";
    }


}
