package strategy;

public class SMSNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message, String user) {
        System.out.println("SMS to " + user + ": " + message);
    }
}
