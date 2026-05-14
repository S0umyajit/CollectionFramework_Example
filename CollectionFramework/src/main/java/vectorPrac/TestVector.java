package vectorPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(10,5);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Before Remove ALL: "+vector);
        System.out.println("size: "+vector.size());
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Vector<Integer>v=new Vector<>(Arrays.asList(1,2,3));
        vector.removeAll(list);
        System.out.println("After removeAll: "+vector);

        System.out.println(vector.capacity());
    }
}
