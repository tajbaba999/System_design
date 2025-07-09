package observer;

import strategy.NotificationStrategy;

public class UserSubscriber implements Observer{
   private String username;
    NotificationStrategy notificationStrategy;

    public UserSubscriber(String username, NotificationStrategy strategy){
        this.username = username;
        this.notificationStrategy = strategy;
    }

    public void update(String message) {
        notificationStrategy.sendNotification(message, username);
    }

    public void setNotificationStrategy(NotificationStrategy strategy){
        this.notificationStrategy = strategy;
    }
}
