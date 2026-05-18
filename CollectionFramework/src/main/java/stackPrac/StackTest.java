package stackPrac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("all data of the stack: "+stack);
        Integer checkLastElement=stack.peek();
        System.out.println("Last element of the stack"+checkLastElement);
        Integer removeElement=stack.pop();
        System.out.println("Element removed from the stack: "+removeElement);

        stack.push(5);
        System.out.println(stack);

//Stack using LinkedList

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        System.out.println("linkedlist: "+linkedList);

        Integer removedele=linkedList.removeLast();
        System.out.println("element removed from the last: "+removedele);

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("arrayList: "+arrayList);

        Integer removeElm=arrayList.remove(arrayList.size()-1);
        System.out.println("remove from last ArrayList: "+removeElm);

    }
}
