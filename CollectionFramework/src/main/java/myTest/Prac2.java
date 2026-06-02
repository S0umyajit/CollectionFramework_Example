package myTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Prac2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.1));   // Fix the stray ";Charlie" at the end here!
        students.add(new Student("Dob", 3.5));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> reversed = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(reversed);
        System.out.println(students);
        }
}
