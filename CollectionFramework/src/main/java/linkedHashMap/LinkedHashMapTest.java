package linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        /**
         *  linkedhashmap use ordered list
         */
        linkedHashMap.put("Apple",12);
        linkedHashMap.put("Orange",20);
        linkedHashMap.put("Banana",23);
        linkedHashMap.put("Pomogranate",24);
        linkedHashMap.put("Tomato",26);

        System.out.println("linkedHashMap: "+linkedHashMap);
        /**
         * Hashmap don't follow any order
         */
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Apple",12);
        hashMap.put("Orange",20);
        hashMap.put("Banana",23);
        hashMap.put("Pomogranate",24);
        hashMap.put("Tomato",26);

        System.out.println("hashmap: "+hashMap);

    }
}
