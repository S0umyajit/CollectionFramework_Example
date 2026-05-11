package genericCOnstructor;

public class Prac {

   <T extends Number> Prac(T value){
       System.out.println(value);
   }

    public static void main(String[] args) {
//        Prac p=new Prac("hi");
        Prac p1=new Prac(1);
    }
}
