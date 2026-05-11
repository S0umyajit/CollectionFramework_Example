package genericInterfaceEx;

public class Prac<T> implements Container<T>{

    private T val;
    @Override
    public void add(T val) {
        this.val=val;
    }

    @Override
    public T get() {
        return val;
    }
}
