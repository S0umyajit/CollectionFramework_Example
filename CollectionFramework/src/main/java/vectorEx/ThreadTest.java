package vectorEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadTest {

    public static void main(String[] args) {

        List<Integer> list=new Vector<>();



        Thread thread1=new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        Thread thread2=new Thread(()->{
           for(int i=0;i<1000;i++){
               list.add(i);
           }
        });


        thread1.start();
        thread2.start();



        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(list.size());
    }
}
