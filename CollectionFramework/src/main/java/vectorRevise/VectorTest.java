package vectorRevise;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();

        v.add(1);
        v.add(2);
        v.add(3);

        System.out.println("Capacity: "+v.capacity());
        System.out.println("Size: "+v.size());
        System.out.println("values: "+v);


        System.out.println("=============================New Vector===========================");
        Vector<Integer> v1=new Vector<>(2,3);

        v1.add(4);
        v1.add(6);
        v1.add(9);

        System.out.println(v1.capacity());
        System.out.println(v1.size());
        System.out.println(v1);

        v.addAll(v1);
        System.out.println(v);
    }
}
