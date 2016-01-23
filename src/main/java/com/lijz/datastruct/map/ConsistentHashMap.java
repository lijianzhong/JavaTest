package com.lijz.datastruct.map;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.Collection;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Created by jianzhongli on 16/1/14.
 */
public class ConsistentHashMap<T> {

    private HashFunction hashFunction;
    private int numberOfRep;
    SortedMap<Long, T> map = new TreeMap<Long, T>();
    public ConsistentHashMap(HashFunction hashFunction, int numberOfRep, Collection<T> nodes){

        this.hashFunction = hashFunction;
        this.numberOfRep = numberOfRep;
        for(T node : nodes){
            addNode(node);
        }

    }

    public void addNode(T node){
        for(int i=0; i<numberOfRep; i++){
            Long hashCode = hashFunction.hashString(node.toString() + i, Charsets.UTF_8).asLong();
            map.put(hashCode, node);
        }
    }

    public void remove(T node){
        for(int i=0; i< numberOfRep; i++){
            Long hashCode = hashFunction.hashString(node.toString() + i, Charsets.UTF_8).asLong();
            map.remove(hashCode);
        }
    }


    public T get(Object key){

        Long hashCode = hashFunction.hashString(key.toString(), Charsets.UTF_8).asLong();

        SortedMap<Long, T> tailMap = map.tailMap(hashCode);

        hashCode = tailMap.isEmpty() ? map.firstKey() : tailMap.firstKey();

        return map.get(hashCode);

    }


    public static void main(String[] args){

        List<String> al = Lists.newArrayList();
        al.add("redis1");
        al.add("redis2");
        al.add("redis3");
        al.add("redis4");

        String[] userIds ={"-84942321036308",
                        "-76029520310209",
                        "-68343931116147",
                        "-54921760962352"};

        ConsistentHashMap<String> circle = new ConsistentHashMap<String>(Hashing.md5(), 3, al);

        for (String userId : userIds) {
            System.out.println(circle.get(userId));
        }
    }



}
