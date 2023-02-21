/*package p1;
import java.util.Iterator;


    public class HashMap<K,V> implements Map<K,V>{
    public HashMap(){
        this(16, 0.75f);
    }
    public HashMap(int capacity, float loadFactor){

    }
    @Override public Iterator<K> iterator(){
        return new CIterator();
    }
    private static class Node<K,V>{
        K key;
		V value;
		
		Node<K, V> next;
		
		public Node(K key, V value) {
			
			this.key = key;
			this.value =value;
    }
    private class CIterator implements Iterator<K>{
    @Override public boolean hasNext() { ... }
    @Override public K next() { ... }
    }
}

}
*/