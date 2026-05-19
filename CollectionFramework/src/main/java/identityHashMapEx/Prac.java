package identityHashMapEx;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Prac {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
        /*
         * this will return only one value
         * cause in hashmap it uses String class hashcode
         * and then as the value is same the key hashcode will be same
         * index will be same
         * and then .equals() method will be called
         * it will check the value
         * as the value is same
         * it will overwrite the value
         */
        HashMap<String,Integer> map=new HashMap<>();
        /**
         * Identity hashmap checkes
         * IdentityHashCode which use object class hashcode rule
         * and == method check the reference
         */
        Map<String,Integer> map1=new IdentityHashMap<>();

        map.put(key1,1);
        map.put(key2,2);
        map1.put(key1,1);
        map1.put(key2,2);

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));


        System.out.println("Hashmap :"+map);
        System.out.println("Identity Hashmap: "+map1);
    }
}
