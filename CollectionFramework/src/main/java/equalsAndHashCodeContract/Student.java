package equalsAndHashCodeContract;

import java.util.Objects;

public class Student {
    public String name;
    public int roll;

    @Override
    public int hashCode() {
        return Objects.hash(name,roll);
    }

    @Override
    public boolean equals(Object obj) {

        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Student student=(Student) obj;
        return roll==student.getRoll() && Objects.equals(name,student.getName());
    }

    @Override
    public String toString() {
        return "roll: "+roll+" "+"name: "+name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
