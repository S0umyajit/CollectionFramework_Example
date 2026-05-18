package copyOnArrayListTest;

import java.util.ArrayList;

public class CopyOnArrayPrac {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("bread");
        list.add("tea");
        list.add("biriyani");

        //  Modifying the ArrayList while iterating over it
        // changes its structure (size changes).
        // The Iterator detects this modification and throws
        // ConcurrentModificationException.
        //
        // In Java, you cannot add/remove elements directly
        // from a collection while using a for-each loop.

        for(String e:list){
            System.out.println("existing lost: "+list);
            if(e.equals("bread")){
                list.add("butter");
                System.out.println("added to the list");
            }
        }
        System.out.println("new List: "+list);
    }
}
