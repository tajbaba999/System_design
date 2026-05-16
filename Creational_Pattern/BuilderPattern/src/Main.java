import model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new  User.
                Builder()
                .setName("Taj")
                .setEmail("taj@gmail.com")
                .setAge(23)
                .build();

        System.out.println(user1.toString());

        User user2 = new User.Builder()
                .setName("Baba")
                .setAge(23)
                .build();

        System.out.println(user2.toString());

    }
}