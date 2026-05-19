package converListToArray;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer arr[]=list.toArray(new Integer[0]);

        for(Integer a:arr){
            System.out.println(a);
        }
    }
}
