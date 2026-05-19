package comparableEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(12,"ABC");
        Student s2=new Student(14,"BCA");
        Student s3=new Student(15,"CCA");
        Student s4=new Student(13,"DDD");

        List<Student> list= Arrays.asList(s1,s2,s3,s4);
        list.sort(null);
        System.out.println(list);


    }
}

class Student implements Comparable<Student>{
    private String name;
    private double number;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       if(this.number<o.number){
           return 1;
       } else if (this.number>o.number) {
           return -1;
       }
       else{
           return 0;
       }
    }
}
