package linkedListRevise;

import java.util.Arrays;
import java.util.LinkedList;

public class SomeMoreEx {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.addFirst(0);
        list.addLast(7);
        System.out.println("Before: "+list);
        list.removeIf(x->x%2==0);

        System.out.println("After: "+list);



        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Dog","Cat","Lion","Elephant"));
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("Dog","Cat"));

        animals.removeAll(animalToRemove);

        System.out.println(animals);
    }
}
