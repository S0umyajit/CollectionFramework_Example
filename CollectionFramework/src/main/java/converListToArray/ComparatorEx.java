package converListToArray;

import java.util.*;

public class ComparatorEx {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("banana","papaya","mango");

        //list.sort(null);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        List<Integer> myList=new ArrayList<>();

        myList.add(2);
        myList.add(1);
        myList.add(3);

        myList.sort(new MyComparator());
        System.out.println(myList);

    }


}
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
