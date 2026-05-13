package genericMethod;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        Integer [] a1={1,2,3,4};
        String [] a2={"Hello","World"};
        test.printArr(a1);
        test.printArr(a2);
    }

    public <T> void printArr(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }
}

