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
        // 1. Create a Phone object with ONLY a WeakReference pointing to it (no strong references).
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Samsung", 23000));

        // This will print the Phone details because the object hasn't been collected yet.
        System.out.println("WeakReference " + weakReference.get());

        // 2. Explicitly request Garbage Collection.
        // Since the Phone object is ONLY weakly reachable, the GC is guaranteed to clear it.
        System.gc();

        try {
            // Sleep to give the GC thread a window to finish execution.
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// 3. This will print 'null'. The underlying Phone object was aggressively reclaimed
// by the GC during the system call because no strong reference held it in memory.
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
