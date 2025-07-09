package strategy;

public class PushNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Push notification to " + user + ": " + message);
    }
}
