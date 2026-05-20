package linkedListRevise;

public class Main {
    public static void main(String[] args) {
        Node node1=new Node(1,new Node(2,null));
        System.out.println(node1);
    }
}

class Node{
    private int val;
    private Node next;


    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }

    @Override
    public String toString() {

        if(next==null){
            return val+"";
        }
        return "val: "+val+" "+next;
    }
}
