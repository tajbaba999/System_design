import observer.UserSubscriber;
import service.NotificationService;
import strategy.EmailNotification;
import strategy.NotificationStrategy;
import strategy.PushNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        UserSubscriber user1 = new UserSubscriber("Alice" , new EmailNotification());
        UserSubscriber user2 = new UserSubscriber("Bob", new PushNotification());
        UserSubscriber user3 = new UserSubscriber("Charlie", new PushNotification());


        service.subscribe(user1);
        service.subscribe(user2);
        service.subscribe(user3);

        service.notifyUsers(" Big Sale on Electronics!");

        user2.setNotificationStrategy(new PushNotification());
        System.out.println("\nBob changed to Push Notification.\n");


        service.notifyUsers("🎉 New Product Launch!");
    }
}