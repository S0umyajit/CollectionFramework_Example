package equalsAndHashCodeContract;

import java.util.HashMap;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {

        // -------------------------------------------------------------------------
        // CASE 1: HashMap with a CUSTOM KEY (Student)
        // -------------------------------------------------------------------------
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("Anuj", 1);
        Student s2 = new Student("Payel", 2);
        Student s3 = new Student("Anuj", 1); // Duplicate data of s1, but a separate memory object

        map.put(s1, "Engineer");
        map.put(s2, "Doctor");

        /*
         * BEHAVIOR NOTE:
         * If Student OVERRIDES equals() & hashCode(): map.size() will be 2.
         * -> s3 will overwrite s1's value ("Engineer" becomes "Nurse").
         * * If Student DOES NOT override them: map.size() will be 3.
         * -> s1 and s3 will coexist as separate keys because they have different memory addresses.
         */
        /*
        After overriding the hashcode now we are getting the expected result
        now if the roll and the name is same then it will be considered as a same value
         */
        map.put(s3, "Nurse");

        System.out.println("Student Map Size: " + map.size());
        System.out.println("Student Map Contents: " + map);

        System.out.println("---------------------------------------------------------");

        // -------------------------------------------------------------------------
        // CASE 2: HashMap with a BUILT-IN KEY (String)
        // -------------------------------------------------------------------------
        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("Apple", 30);
        map1.put("Banana", 39);

        /*
         * BEHAVIOR NOTE:
         * String already overrides equals() & hashCode() out-of-the-box in Java.
         * Since the content "Apple" matches perfectly, this operation will update
         * the existing "Apple" key's value from 30 to 40 instead of adding a new entry.
         */
        map1.put("Apple", 40);

        System.out.println("String Map Size: " + map1.size()); // Will always be 2
        System.out.println("String Map Contents: " + map1);
    }
}