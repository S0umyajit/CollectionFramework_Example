package genericEnum;
enum Operation{
    ADD,MULTIPLY,SUBSTRACTION, DIVIDE;

    public <T extends Number> double apply(T a,T b){
        switch(this){
            case ADD -> {
                return a.doubleValue()+b.doubleValue();
            }
            case DIVIDE -> {
                return a.doubleValue()/ b.doubleValue();
            }
            case MULTIPLY -> {
                return a.doubleValue() * b.doubleValue();
            }
            case SUBSTRACTION -> {
                return a.doubleValue() - b.doubleValue();
            }
            default -> throw new AssertionError("unknown error: "+this);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(1,2));
        System.out.println(Operation.MULTIPLY.apply(4,6));
    }
}
