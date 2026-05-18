package copyOnArrayListTest;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListSolution {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("bread");
        copyOnWriteArrayList.add("jam");
        copyOnWriteArrayList.add("tea");

        for(String i:copyOnWriteArrayList){
            System.out.println("existing list: "+i);

            if(i.equals("bread")){
                copyOnWriteArrayList.add("butter");
            }
        }
        System.out.println("new list: "+copyOnWriteArrayList);
    }
}
