public class UserFactory {
    public static User getUser(String name){
        if(name == null || name.isEmpty()){
            return new NullUser();
        }
        return new RealUser(name);
    }
}
