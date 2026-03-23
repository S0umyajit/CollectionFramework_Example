package org.example;

public class GenericsEx {
    public static <T> void main(String[] args) {
        Store s = new Store();

        // ISSUE: Throws java.lang.ClassCastException at runtime.
        // 1. '1.2f' is autoboxed into a java.lang.Float object.
        // 2. 's.getItem()' returns this Float disguised as a generic Object.
        // 3. Casting directly to '(double)' forces Java to try casting the Object to a java.lang.Double wrapper first.
        // 4. Because a Float cannot be cast to a Double (they are sibling classes), it crashes.
        // FIX: Unbox it to a float first -> double d = (float) s.getItem();

//        s.setItem(1.2f);
//        double d = (double) s.getItem();
//
//        System.out.println(d);
        Store2<String> store2=new Store2<String>();
        store2.setItem(String.valueOf(1));;
        System.out.println(store2.getItem());

    }
}
