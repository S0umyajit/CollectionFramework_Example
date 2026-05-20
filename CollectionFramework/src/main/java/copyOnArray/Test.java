package copyOnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {

//        List<Integer> list=new CopyOnWriteArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        for(Integer i:list){
//            if(i==1){
//                list.add(10);
//            }
//            System.out.println(i);
//        }
//        System.out.println(list);
//        System.out.println("==========The END===========");



        List<String> li=new CopyOnWriteArrayList<>();
        li.add("item1");
        li.add("item2");
        li.add("item3");
        Thread readerThread=new Thread(()->{
            try {
                while (true) {
                    for(String i:li){
                        System.out.println(i);
                        Thread.sleep(5000);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread writerThread=new Thread(()->{
           try{
               System.out.println("Triggered writer Thread");
               Thread.sleep(5000);
               li.add("item5");
               System.out.println("Added item5 ");
               Thread.sleep(1000);
               li.remove("item1");
               System.out.println("Removed item1");
           }catch (Exception e){
               e.printStackTrace();
           }
        });

        readerThread.start();
        writerThread.start();
    }
}
