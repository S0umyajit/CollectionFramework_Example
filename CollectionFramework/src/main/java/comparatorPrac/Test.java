package comparatorPrac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class TestComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
class TestComparatorString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
public class Test {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,4,2,3,9,8);

        l1.sort(new TestComparator());
        System.out.println(l1);

        List<String>l2=Arrays.asList("Soumya","Arunima","Anu","Abcdefr");

        l2.sort(new TestComparatorString());
        System.out.println(l2);

    }

}
