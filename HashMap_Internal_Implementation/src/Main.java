import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.*;

public class Main {
    public static void main(String[] args) {
//            Map<Integer, String> map = new HashMap<>();
            MyHashMap<Integer, String> map = new MyHashMap<>(24);
            map.put(23, "Alice");
            map.put(22, "Bob");
            map.put(24, "Cat");

            String name = map.get(24);
            System.out.println("Name : " + name);
            for (MapEntry<Integer, String> ele : map.entrySet()){
                System.out.println("Key : "+ele.getKey() +" Value : "+ ele.getValue());
            }
    }
}