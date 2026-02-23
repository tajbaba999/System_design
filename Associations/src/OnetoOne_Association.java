class Proile{
    public User user;

    public  void  setUser(Proile proile){
        this.user = user;
    }
}

class User{
    public  Proile profile;

    public void setProile(Proile profile){
        this.profile = profile;
    }
}

/* Each object of one class is linked to exactly one object of the other class.
* Example: Each User has exactly one Profile, and each Profile belongs to one User. This is a bidirectional one-to-one relationship  */



public class OnetoOne_Association {
    public static void main(String[] args) {
            User user1 = new User();
            User user2 = new User();

          Proile profile1 = new Proile();
          Proile profile2 = new Proile();

           user1.setProile(profile1);
           user2.setProile(profile2);
    }
}
