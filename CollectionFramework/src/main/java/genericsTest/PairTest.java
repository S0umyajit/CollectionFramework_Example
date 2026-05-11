package genericsTest;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer,String> pair=new Pair<>(1,"Soumya");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
