package threadTestVector;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Example for Thread Safe between arrayList and Vector
 */
public class MyThread extends Thread{

    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
        Vector<Integer> list=new Vector<>();

        Thread thread1=new Thread(()->{
              for(int i=0;i<=1000;i++){
                  list.add(i);
              }
        });
        Thread thread2=new Thread(()->{
            for(int i=0;i<=1000;i++){
                list.add(i);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());
    }
}
