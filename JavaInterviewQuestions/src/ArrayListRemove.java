import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(12);
        lst.add(23);
        lst.add(34);

        System.out.println(lst);
        // passing the object to remove the element
        lst.remove(Integer.valueOf(12));
        //passing the index to remove element
        lst.remove(0);
        System.out.println(lst);
    }
}
