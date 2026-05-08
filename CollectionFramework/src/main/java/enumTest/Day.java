package enumTest;

public enum Day {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("Friday"),
    SATURDAY("saturday");

    private String lower;
    private Day(String lower){
        System.out.println("Constructor called for: "+lower);
        this.lower=lower;

    }

    public String getLower() {
        return lower;
    }

    public String display(){
        return "Today is: "+this.name();
    }
}
