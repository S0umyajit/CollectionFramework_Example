package multiGenerics;

public class TestBoundedEx {
    public static void main(String[] args) {
        System.out.println(BoundedTypeParamGenerics.min(122,23));
        System.out.println(BoundedTypeParamGenerics.add(12,23));
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
        Double arr[]={1.2,2.1,0.3,4.1,5.1};
        System.out.println(NewBoundedExercise.countGreaterItems(arr,0.1));

        NewBoundedExercise.printGreaterItem(arr,0.1);
    }
}
