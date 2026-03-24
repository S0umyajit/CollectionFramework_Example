package multiGenerics;

public class TestBoundedEx {
    public static void main(String[] args) {
        System.out.println(BoundedTypeParamGenerics.min(122,23));

        Person p1=new Person(12,"Soumya");
        Person p2=new Person(23,"Anuj");

        System.out.println(BoundedTypeParamGenerics.min(p1,p2));

        int num=p1.compareTo(p2);

        if (num<0){
            System.out.println(p1.toString());
        }
        else {
            System.out.println(p2.toString());
        }
    }
}
