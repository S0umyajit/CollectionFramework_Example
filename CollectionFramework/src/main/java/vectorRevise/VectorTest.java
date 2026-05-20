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
    }
}
