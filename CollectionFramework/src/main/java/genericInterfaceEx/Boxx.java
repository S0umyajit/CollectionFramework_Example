package genericInterfaceEx;

interface Printable{
    void print();
}

public class Boxx extends Number implements Printable {

    private int val;
    Boxx(int val){
        this.val=val;
    }
    @Override
    public void print() {
        System.out.println(val);
    }

    @Override
    public int intValue() {
        return val;
    }

    @Override
    public long longValue() {
        return val;
    }

    @Override
    public float floatValue() {
        return val;
    }

    @Override
    public double doubleValue() {
        return val;
    }
}

class Test<T extends Number & Printable>{
    private T val;
    Test(T val){
        this.val=val;
    }

    public void diplay(){
        val.print();
    }

    public T getVal(){
        return val;
    }

}

class MainT{
    public static void main(String[] args) {
        Boxx boxx=new Boxx(11);
        Test<Boxx>t=new Test<>(boxx);
        t.diplay();


    }
}
