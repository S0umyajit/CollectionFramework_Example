package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Lease Recently used
 * @param <K>
 * @param <V>
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> {
        private int capacity;
        public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {

            LRUCache<String,Integer>lruCache=new LRUCache<>(3);
            lruCache.put("Anuj",12);
            lruCache.put("Swapan",23);
            lruCache.put("Mona",22);
            lruCache.get("Anuj");
            lruCache.put("Soumya",233);
        System.out.println(lruCache);
    }
}
