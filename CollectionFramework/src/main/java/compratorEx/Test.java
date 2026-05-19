package compratorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Student s1=new Student("Soumya",3.4);
        Student s2=new Student("Ananya",3.6);
        Student s5=new Student("Sanjay",3.6);
        Student s3=new Student("Anuj",3.1);
        Student s4=new Student("Arunima",3.6);

        List<Student> list=new ArrayList<>();

        List<Student> myList=Arrays.asList(s1,s2,s3,s4,s5);
        //this will not work as it is casted to int so only int value will be taken here the int value for
        //all are 3
      //  myList.sort((a,b)-> (int) (a.getNumber()-b.getNumber()));

        Comparator<Student> com=Comparator
                .comparing(Student::getNumber)
                .reversed()
                .thenComparing(Comparator.comparing((Student s)->s.getName().length()).reversed())
                .thenComparing(Student::getName);
        myList.sort(com);
        System.out.println(myList);



//        myList.sort((a,b)->{
//            if(a.getNumber()-b.getNumber()>0){
//                return 1;
//            }
//            else if (a.getNumber()-b.getNumber()<0){
//                return -1;
//            }
//            else {
//                return a.getName().compareTo(b.getName());
//            }
//        });
//        System.out.println(myList);
    }
}

class Student{
    private String name;
    private double number;

    public Student(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
