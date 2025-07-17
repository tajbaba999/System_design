//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = UserFactory.getUser("Taj");
        User user2 = UserFactory.getUser(null);

        user1.sendNotification();
        user2.sendNotification();
    }
}