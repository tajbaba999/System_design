public class NotificationFactory {
    public static Notification createNotification(String type){
        switch (type.toLowerCase()){
            case "email" : return new EmailNotification();
            case "sms" : return new SMSNotification();
            case "push" : return new PushNotification();
            default: throw new IllegalStateException("Invalid type");
        }
    }
}
