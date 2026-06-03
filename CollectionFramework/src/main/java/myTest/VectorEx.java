package myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        Stack<Integer>a1=new Stack<>();


        Thread t1=new Thread(()->{
           for(int i=1;i<=1000;i++){
               a1.add(i);
           }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=1000;i++) {
                a1.add(i);
            }
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(a1.size());
    }
}
