package creational.factory;

public class EmailNotification implements Notification {

    @Override
    public String doNotify() {
        return "email";
    }


}
