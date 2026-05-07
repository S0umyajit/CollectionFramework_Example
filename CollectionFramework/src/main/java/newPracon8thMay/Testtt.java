package newPracon8thMay;

import java.util.ArrayList;

/**
 * Generic test
 */
public class Testtt {
    public static void main(String[] args) {
        /**
         * this is not possible using type casting, int can not be converted to String,
         * int is primitve type and String is Object
         */
//        int i=1234;
//        String a=i;
//        System.out.println(a);

        ArrayList<String> i=new ArrayList();
        i.add("Soumya");
//        int size=i.size();
        String ss=(String)i.get(0);
        System.out.println(ss);

    }
}
