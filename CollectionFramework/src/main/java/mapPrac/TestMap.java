package mapPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Anish");
        map.put(2,"Sayan");
        map.put(3,"Anuj");

        System.out.println(map);
        Set<Integer> keys=map.keySet();
        //entrySet to loop over the map
        for(Integer key:keys){
            System.out.println("loop using entryset: "+map.get(key));

        }

        //another way to loop over map- entrySet

        Set<Map.Entry<Integer,String>> keyss=map.entrySet();
        for(Map.Entry<Integer,String> key:keyss){
            key.setValue(key.getValue().toUpperCase());
            System.out.println(key.getKey()+" "+key.getValue());
        }

        boolean k=map.containsKey(1);
        System.out.println(k);
        map.remove(1);
        System.out.println(map);

    }
}
