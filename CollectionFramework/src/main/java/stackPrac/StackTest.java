package stackPrac;

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



    }
}
