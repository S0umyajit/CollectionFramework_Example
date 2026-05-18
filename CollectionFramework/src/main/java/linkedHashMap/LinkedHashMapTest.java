package linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(10,0.5f,true);
        /**
         *  linkedhashmap use ordered list
         */
        linkedHashMap.put("Apple",12);
        linkedHashMap.put("Orange",20);
        linkedHashMap.put("Banana",23);
        linkedHashMap.put("Pomogranate",24);
        linkedHashMap.put("Tomato",26);
        System.out.println("================LinkedHashMap================");
        linkedHashMap.get("Apple"); //access order is true so latest data will go the last of the list
        for(Map.Entry<String,Integer> map:linkedHashMap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
        /**
         * Hashmap don't follow any order
         */
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Apple",12);
        hashMap.put("Orange",20);
        hashMap.put("Banana",23);
        hashMap.put("Pomogranate",24);
        hashMap.put("Tomato",26);
        System.out.println("================HashMap=====================");
        for(Map.Entry<String,Integer> key:hashMap.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }

        int val=hashMap.getOrDefault("Papaya",0);
        System.out.println(val);
        hashMap.putIfAbsent("Papaya",79);
        System.out.println("new HashMap: "+hashMap);
    }
}
