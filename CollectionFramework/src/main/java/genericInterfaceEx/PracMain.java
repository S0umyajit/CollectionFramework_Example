package genericInterfaceEx;

public class PracMain {
    public static void main(String[] args) {
        Prac<String> p=new Prac<>();
        p.add("axew");
        System.out.println(p.get());
    }
}
