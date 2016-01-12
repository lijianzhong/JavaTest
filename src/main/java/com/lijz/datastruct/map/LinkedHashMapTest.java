package com.lijz.datastruct.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jianzhongli on 16/1/12.
 */
public class LinkedHashMapTest {

    public static void main(String[] args){

        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("test1", 100);
        map.put("test3", 300);
        map.put("test2", 200);
        for(Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
