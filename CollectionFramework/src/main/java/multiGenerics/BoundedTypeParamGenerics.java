package multiGenerics;

public class BoundedTypeParamGenerics {

    //We can restrict the type that can be passed to a type parameter
    //This is known as bounded Type parameters
    public static <T extends Comparable<T>> T min(T item1, T item2){

        //compareTo returns -1,0,1, -1 means less, 0 means equal, 1 greater than
        if (item1.compareTo(item2)<0){
            return item1;
        }
        return item2;
    }

    public static <T extends Number> double add(T item1, T item2){
        return item1.doubleValue()+item2.doubleValue();
    }
}
