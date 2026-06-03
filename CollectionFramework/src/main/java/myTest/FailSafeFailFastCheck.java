package myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFastCheck {

    public static void main(String[] args) {

        List<String>list= new CopyOnWriteArrayList<>();

        list.add("Milk");
        list.add("butter");
        list.add("Egg");
        for(String s:list){
            System.out.println(s);
            if(s.equalsIgnoreCase("Butter")){
                list.add("bread");
                System.out.println("Adding New ELe");
            }
        }
        System.out.println(list);
    }
}
