package weakReferenceEx;

import java.lang.ref.WeakReference;

public class Test {

    public static void main(String[] args) {
        /**
         * Example of strong reference
         * It will not collect by JVM as a garbage until there is a reference available for that object
         * that object is considered "alive" and will not be selected for garbage collection.
         */
        Phone phone=new Phone("Iphoen 16",70000);

        phone=null; //it is marked as null means there is no reference.
        System.out.println(phone);

        /**
         * Example of weak reference
         */
        WeakReference<Phone> weakReference=new WeakReference<>(new Phone("Samsung",23000));
        System.out.println("WeakReference "+ weakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(weakReference.get());
    }
}

class Phone{
    String model;
    int price;

    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
