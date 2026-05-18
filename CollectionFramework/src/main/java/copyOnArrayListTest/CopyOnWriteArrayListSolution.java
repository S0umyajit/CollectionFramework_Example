package copyOnArrayListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListSolution {
    public static void main(String[] args) {
//        CopyOnWriteArrayList<String> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
//        copyOnWriteArrayList.add("bread");
//        copyOnWriteArrayList.add("jam");
//        copyOnWriteArrayList.add("tea");
//
//        for(String i:copyOnWriteArrayList){
//            System.out.println("existing list: "+i);
//
//            if(i.equals("bread")){
//                copyOnWriteArrayList.add("butter");
//            }
//        }
//        System.out.println("new list: "+copyOnWriteArrayList);

//        List<String> newL=new ArrayList<>(); //if we use arraylist then it will throw error,
        //As arraylist don't support it, modification while reading
        List<String> newL=new CopyOnWriteArrayList<>();
        newL.add("item1");
        newL.add("item2");
        newL.add("item3");

        Thread readThread=new Thread(()->{
            try{
                while(true){
            for(String e:newL) {
                System.out.println("reading list: " + e);
                Thread.sleep(500);
            }
            }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        });


        Thread writeThread=new Thread(()->{
            try{
               Thread.sleep(500);
               newL.add("item4");
                System.out.println("added item4");

               Thread.sleep(500);
               newL.remove("item1");
                System.out.println("removed item1");
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        });

        readThread.start();
        writeThread.start();


    }
}
