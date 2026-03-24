package multiGenerics;
class Test{
    public <T> void print(T[] array){
        for(T element:array){
            System.out.println(element);
        }
    }

    public <T> boolean checkEquality(T value1, T value2){
        if(value1.equals(value2)){
            return true;
        }
        return false;
    }
}
public class GenericArray {

    public static void main(String[] args) {
        Test t=new Test();
//        Integer [] a={1,2,3,4};
//        String [] s={"abc","bca","dsc"};
//        t.print(a);
//        t.print(s);

        System.out.println(t.checkEquality(12.5,12.5));
    }
}
