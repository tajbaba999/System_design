import java.util.ArrayList;
import java.util.List;

public class MyHashMap <K, V>{
   private int length = 0;
    static class Node<K, V>{
        final int hash;
        final K key;
        V value;
        Node<K, V> next;


        Node(int hash, K key, V value, Node<K, V> next){
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public int capacity = 16;
    public Node<K, V>[] buckets;

    public MyHashMap(int capacity){
        buckets = new Node[capacity];
    }

    private int getIndex(K key){
        return key  == null ? 0 : Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value){
        int hash = (key == null) ? 0 : key.hashCode();
        int index = getIndex(key);

        Node<K, V> newNode = new Node<>(hash, key, value, null);
        Node<K, V> current = buckets[index];
        if(current == null){
            buckets[index] =newNode;
            length++;
        }else {
            Node<K, V> prev = null;
            while (current != null) {
                if (current.hash == hash && (key == current.key || key.equals(current.key))) {
                    current.value = value;
                    length++;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            length++;
        }
    }


    public V get(K key){
        int hash = (key == null) ? 0 : key.hashCode();
        int index = getIndex(key);

        Node<K, V> current = buckets[index];
        while (current != null){
            if(current.hash == hash && (key == current.key || key.equals(current.key))){
                return current.value;
            }
            current = current.next;
        }
        return null;
     }

     public List<MapEntry<K, V>> entrySet(){
        List<MapEntry<K, V>> list = new ArrayList<>();
         for (int i = 0; i < capacity; i++) {
             Node<K, V> bucket = buckets[i];
             if(bucket != null){
                 list.add(new MapEntry<>(bucket.key, bucket.value));
                 bucket = bucket.next;
             }
         }
         return list;
     }

     //Implemented
     public int getLength(){
        return length;
     }

     public boolean containsKey(K key){
        return get(key) != null;
     }
}
