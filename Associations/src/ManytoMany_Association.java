import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.List;

class Users{
    List<Groups>  groups = new ArrayList<>();
    public void joinGrop(Groups g){
        if(!groups.contains(g)){
            groups.add(g);
            g.addUsers(this);
        }
    }
}

class Groups{
    List<Users> users = new ArrayList<>();
    public void addUsers(Users u){
        if(!users.contains(u)){
            users.add(u);
            u.joinGrop(this);
        }
    }
}

public class ManytoMany_Association {
    public static void main(String[] args) {
        Users user1 = new Users();
        Users user2 = new Users();

        Groups group1 = new Groups();
        Groups group2 = new Groups();

        user1.joinGrop(group1);
        user2.joinGrop(group2);

        user2.joinGrop(group1);

        System.out.println("Associations created successfully.");

    }
}
