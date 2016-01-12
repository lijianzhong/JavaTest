package com.lijz.datastruct.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jianzhongli on 16/1/12.
 */
public class LRUCache<K,V> {

    private static final float hashTableLoadFactor = 0.75f;

    private int cacheSize;

    Map<K, V> map;

    public LRUCache(final int cacheSize){
        this.cacheSize = cacheSize;
        int hashTableCapacity = (int)Math.ceil(cacheSize/hashTableLoadFactor) + 1;
        map = new LinkedHashMap<K, V>(hashTableCapacity, hashTableLoadFactor, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > cacheSize;
            }
        };
    }

    public synchronized  void put(K k, V v){
        map.put(k,v);
    }

    public synchronized  V get(K k){
        return map.get(k);
    }

    public static void main(String[] args){
        LRUCache<String, Object> cache = new LRUCache<String, Object>(2);
        cache.put("test1",3);
        cache.put("test2", 6);
        cache.put("test3", 9);
        cache.put("test4", 12);

        System.out.println(cache.get("test1"));
        System.out.println(cache.get("test2"));
        System.out.println(cache.get("test3"));
    }
}
