package enumTest;

public class EnumTT {

    public static void main(String[] args) {
        Day friday= Day.FRIDAY;

        int index=friday.ordinal(); //returns the index number
        System.out.println(index);

        System.out.println(friday.name());
    }
}
