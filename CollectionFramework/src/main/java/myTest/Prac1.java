package myTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,4,0,3);
        list.sort(new MyIntComparator());
        System.out.println(list);
        List<String> fruits=Arrays.asList("Guava","Banana","Apple","Lichi");
        fruits.sort(new MyStringComparator());
        System.out.println(fruits);
    }
}

class MyIntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

    class MyStringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if(o2.length()-o1.length()>0){
                return -1;
            } else if (o2.length()-o1.length()<0) {
                return 1;
            }
            else {
                return o1.compareTo(o2);
            }
        }
    }
