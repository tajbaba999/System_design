//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Notification notification1 = NotificationFactory.createNotification("email");
            notification1.notifyUser();

            Notification notification2 = NotificationFactory.createNotification("sms");
            notification2.notifyUser();

            Notification notification3 = NotificationFactory.createNotification("push");
            notification3.notifyUser();

//            Notification notification4 = NotificationFactory.createNotification("random");
//            notification4.notifyUser();
    }
}