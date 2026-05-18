package mapPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapCapacityCheck {
    public static void main(String[] args) {
        HashMap<String,Integer> maptest= new HashMap<>(10,0.5f);

        maptest.put("Soumya",1);
        maptest.put("Ankan",2);
        Set<Map.Entry<String,Integer>> keys=maptest.entrySet();
        for(Map.Entry<String,Integer> kk:keys){
            if(kk.getKey().equals("Soumya")){
                System.out.println(kk.getKey()+" "+kk.hashCode());
            }
        }
    }
}
