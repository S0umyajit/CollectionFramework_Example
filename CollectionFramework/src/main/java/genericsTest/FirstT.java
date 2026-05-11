package genericsTest;

import java.util.ArrayList;

public class FirstT {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<>();
        li.add("123");
        System.out.println(li.get(0));
        Box<String> box=new Box<>();
        box.setVal("Anushka");
        String i=box.getVal();
        System.out.println(i);


    }
}
