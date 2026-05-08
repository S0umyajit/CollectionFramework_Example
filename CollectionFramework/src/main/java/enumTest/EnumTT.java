package enumTest;

public class EnumTT {

    public static void main(String[] args) {
        Day friday= Day.FRIDAY;

        int index=friday.ordinal(); //returns the index number
        System.out.println(index);

        System.out.println(friday.name());

        //Enum array

        Day allDays[]=Day.values();

        for(Day i:allDays){
            System.out.println(i);
        }
        System.out.println(friday.display());
        System.out.println(friday.getLower());

        Day day=Day.MONDAY;

        switch (day){
            case FRIDAY -> System.out.println("FRIDAY");
            case SUNDAY -> System.out.println("SUNDAY");
            default -> System.out.println("Don't know");

        }
    }
}
