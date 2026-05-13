package arrayListPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstTest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(45);
        list.add(1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
