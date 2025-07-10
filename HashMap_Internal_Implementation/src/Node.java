class  Node <K, V> {
        final  int hash;
        final  K key;
        V value;
        Node<K, V> next;

    Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

}
