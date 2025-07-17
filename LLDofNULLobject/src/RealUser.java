public class RealUser implements User{

    String name;

    RealUser(String name){
        this.name = name;
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending notification to :"+name);
    }
}
