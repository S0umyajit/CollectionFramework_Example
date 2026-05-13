package comparatorPrac;

import java.util.ArrayList;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("Alice",3.4));
        list.add(new Student("Bob",3.7));
        list.add(new Student("Charlie",3.5));
        list.add(new Student("Akshit",3.5));

        for(Student s: list){
            System.out.println(s.getName()+" "+s.getGpa());
        }
        System.out.println("===================================================");

       Comparator comparator= Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        list.sort(comparator);
        for(Student s: list){
            System.out.println(s.getName()+" "+s.getGpa());
        }
        System.out.println("====================================");
        list.sort((s1,s2)->{
            if(s1.getGpa()-s2.getGpa()<0){
                return -1;
            } else if (s1.getGpa()-s2.getGpa()>0) {
               return  1;
            }
            else {
                return s1.getName().compareTo(s2.getName());
            }

        });
        for(Student s: list){
            System.out.println(s.getName()+" "+s.getGpa());
        }
    }
}
