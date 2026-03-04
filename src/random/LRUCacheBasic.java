package random;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheBasic {
    public static void main(String[] args) {

        /**
         So whenever you call:
         get()
         put()
         the accessed entry moves to the end of the list, making it most recently used.
         */

        LRUCache cache = new LRUCache(3);

        cache.put(1, 100);
        cache.put(2, 200);
        cache.put(3, 300);

        System.out.println("Initial cache: " + cache);

        // Access key 1 -> becomes recently used
        cache.get(1);

        // Add new key -> should remove least recently used (key 2)
        cache.put(4, 400);

        System.out.println("After adding key 4: " + cache);

        // Access key 3
        cache.get(3);

        // Add new key -> should remove least recently used (key 1)
        cache.put(5, 500);

        System.out.println("After adding key 5: " + cache);
    }
}

class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // accessOrder = true
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
