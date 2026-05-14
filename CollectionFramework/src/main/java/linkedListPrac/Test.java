package linkedListPrac;

public class Test {
    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        node1.value=1;
        node2.value=2;
        node1.next=node2;
        node2.next=null;

        System.out.println(node1.value);
        System.out.println(node1.next.value);
        if(node2.next!=null) {
            System.out.println(node2.next.value);
        }

    }

}

class Node{
    public int value;
    public Node next;


}
