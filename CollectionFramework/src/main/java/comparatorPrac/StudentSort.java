package comparatorPrac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Bob",2.3));
        list.add(new Student("zarlie",2.4));
        list.add(new Student("Nharile",2.4));
        list.add(new Student("Tommie",3.3));

        Comparator<Student> comparator=Comparator.comparing(Student::getGpa).reversed();

        for(Student s:list){
            System.out.println(s.getName()+" "+s.getGpa());
        }
        System.out.println("============================");


        list.sort((s1,s2)->{
           if(s1.getGpa()-s2.getGpa()<0){
               return -1;
           } else if (s1.getGpa()-s2.getGpa()>0) {
               return 1;
           }
           else {
               return s2.getName().compareTo(s1.getName());
           }
        });

        for(Student s:list){
            System.out.println(s.getName()+" "+s.getGpa());
        }


    }
}
