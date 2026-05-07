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

        ArrayList i=new ArrayList();
        i.add(12);
        i.add("Soumya");
//        int size=i.size();

        for(int a=0;a<i.size();a++){
            System.out.println(i.get(a));
        }
    }
}
