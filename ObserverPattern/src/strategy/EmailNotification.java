package strategy;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message, String user) {
        System.out.println("Email to " + user + ": " + message);
    }
}
